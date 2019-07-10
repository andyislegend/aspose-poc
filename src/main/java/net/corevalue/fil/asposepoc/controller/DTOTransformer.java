package net.corevalue.fil.asposepoc.controller;

import net.corevalue.fil.asposepoc.data.Attachment;

public class DTOTransformer {

    public static Response transform(Attachment attachment, String html) {

        return Response.builder()
                .attachmentId(attachment.getAttachmentId())
                .documentId(attachment.getDocumentId())
                .category(attachment.getCategory())
                .originalName(attachment.getOriginalName())
                .fileHTML(html)
                .build();
    }
}
