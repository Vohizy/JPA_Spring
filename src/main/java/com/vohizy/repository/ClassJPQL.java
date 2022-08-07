package com.vohizy.repository;

import com.vohizy.model.Students;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClassJPQL implements StudentRepository{
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
    EntityManager entityManager = emfactory.createEntityManager();
    @Override
    public List<Students> findAll() {
        entityManager.getTransaction().begin();
        Query SQL =entityManager.createQuery("SELECT s from student s");
        List<Students> lists = (List<Students>) SQL.getResultList();
        return lists;
    }

    @Override
    public Students add(Students s) {
        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        return s;
    }

    @Override
    public void deleteById(Long id) {
        entityManager.getTransaction().begin();
        Query SQL = entityManager.createQuery("DELETE FROM 'student' where id="+id);
        SQL.executeUpdate();

    }

    @Override
    public Students updateNamewById(Long id, String newName) {
        entityManager.getTransaction().begin();
        Query SQL = entityManager.createQuery(String.format("UPDATE student SET name=%s WHERE id=%s",newName,id));
        return (Students) SQL.getResultList();
    }

    @Override
    public List findWhereNameLike(String query) {
        entityManager.getTransaction().begin();
        Query SQL = entityManager.createQuery("select * from student where name like '%"+query+"%'");
        return SQL.getResultList();
    }
}
