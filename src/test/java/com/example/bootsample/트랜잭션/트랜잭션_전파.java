package com.example.bootsample.트랜잭션;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.Platform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
public class 트랜잭션_전파 {

    @Autowired
    PlatformTransactionManager txManager;

    @TestConfiguration
    static public class Config {

        @Bean
        public PlatformTransactionManager platformTransactionManager(DataSource dataSource) {
            return new DataSourceTransactionManager(dataSource);
        }

    }


    @Test
    void outer_commit(){

        TransactionStatus outer = txManager.getTransaction(new DefaultTransactionAttribute());
        log.info("Outer Tx = {}", outer.isNewTransaction() );


        TransactionStatus inner = txManager.getTransaction(new DefaultTransactionAttribute());
        log.info("Inner Tx = {}", inner.isNewTransaction() );
        txManager.commit(inner);

        txManager.commit(outer);
    }


    @Test
    void outer_rollback(){

        TransactionStatus outer = txManager.getTransaction(new DefaultTransactionAttribute());
        log.info("Outer Tx = {}", outer.isNewTransaction() );


        TransactionStatus inner = txManager.getTransaction(new DefaultTransactionAttribute());
        log.info("Inner Tx = {}", inner.isNewTransaction() );

        log.info("내부 트랜잭션 커밋");
        txManager.commit(inner);

        log.info("외부 트랜잭션 롤백");
        txManager.rollback(outer);

    }


    @Test
    void inner_rollback(){

        TransactionStatus outer = txManager.getTransaction(new DefaultTransactionAttribute());
        log.info("Outer Tx = {}", outer.isNewTransaction() );


        TransactionStatus inner = txManager.getTransaction(new DefaultTransactionAttribute());
        log.info("Inner Tx = {}", inner.isNewTransaction() );

        log.info("내부 트랜잭션 롤백");
        txManager.rollback(inner);

        log.info("외부 트랜잭션 커밋");

        Assertions.assertThatThrownBy( () -> {
            txManager.commit(outer);
        }).isInstanceOf(UnexpectedRollbackException.class);

    }



    @Test
    void inner_rollback_requires_new() {

        log.info("외부 트랜잭션 시작");
        TransactionStatus outer = txManager.getTransaction(new DefaultTransactionAttribute());

        log.info("outer.isNewTransaction()={}", outer.isNewTransaction());

        log.info("내부 트랜잭션 시작");
        DefaultTransactionAttribute definition = new DefaultTransactionAttribute();
        definition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);

        TransactionStatus inner = txManager.getTransaction(definition);

        log.info("inner.isNewTransaction()={}", inner.isNewTransaction());
        log.info("내부 트랜잭션 롤백");
        txManager.rollback(inner); //롤백

        log.info("외부 트랜잭션 커밋");
        txManager.commit(outer); //커밋

    }


}
