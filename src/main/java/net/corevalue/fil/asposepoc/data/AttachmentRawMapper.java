package net.corevalue.fil.asposepoc.data;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AttachmentRawMapper implements RowMapper<Attachment> {

    @Override
    public Attachment mapRow(ResultSet resultSet, int i) throws SQLException {

        Attachment attachment = new Attachment();
        attachment.setAttachmentId(resultSet.getString("AttachmentId"));
        attachment.setDocumentId(resultSet.getString("DocumentId"));
        attachment.setCategory(resultSet.getInt("Category"));
        attachment.setOriginalName(resultSet.getString("OriginalName"));
        attachment.setFile(resultSet.getBytes("File"));

        return attachment;
    }
}
