package net.corevalue.fil.asposepoc.controller;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {

    private String attachmentId;

    private String documentId;

    private int category;

    private String originalName;

    private String fileHTML;

}
