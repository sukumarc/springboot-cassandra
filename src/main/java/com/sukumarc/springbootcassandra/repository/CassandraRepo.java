package com.sukumarc.springbootcassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.sukumarc.springbootcassandra.model.CassandraTable;

import java.util.List;
import java.util.UUID;

@Repository
public interface CassandraRepo extends CassandraRepository<CassandraTable, UUID> {

  List<CassandraTable> findById(final String id);

  List<CassandraTable> findByTitle(final String title);

}
