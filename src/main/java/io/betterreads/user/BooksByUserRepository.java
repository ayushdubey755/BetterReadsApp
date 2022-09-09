package io.betterreads.user;

import com.datastax.oss.driver.internal.core.type.codec.TimeUuidCodec;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface BooksByUserRepository extends CassandraRepository<BooksByUser, String> {

    Slice<BooksByUser> findAllById(String id, Pageable pageable);

    @Query(value = "SELECT * FROM books_by_user WHERE timeUuid > maxTimeuuid('2022-08-18 00:00+0000')AND timeUuid < minTimeuuid('2016-08-18 00:00+0000');")
    Slice<BooksByUser> findAllByIdBetween(String id, Pageable pageable);

}