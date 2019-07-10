package net.corevalue.fil.asposepoc.data;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DataConnector {

    private final JdbcTemplate jdbcTemplate;

    public Optional<Attachment> getAttachment(String id) {
        String query = "select * from Attachment where AttachmentId = cast(? as UNIQUEIDENTIFIER)";
        try {
            Attachment attachment = jdbcTemplate.queryForObject(query, new Object[]{id}, new AttachmentRawMapper());
            return Optional.ofNullable(attachment);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}

