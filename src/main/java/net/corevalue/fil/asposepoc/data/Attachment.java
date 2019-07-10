package net.corevalue.fil.asposepoc.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attachment {

    private String attachmentId;

    private String documentId;

    private int category;

    private String originalName;

    private byte[] file;
}
