package net.corevalue.fil.asposepoc.controller;

import lombok.RequiredArgsConstructor;
import net.corevalue.fil.asposepoc.converter.DocXConverter;
import net.corevalue.fil.asposepoc.data.Attachment;
import net.corevalue.fil.asposepoc.data.DataConnector;
import net.corevalue.fil.asposepoc.exceptions.AttachmentNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/convert")
public class ConverterController {

    private final DataConnector dataConnector;

    private final DocXConverter docXConverter;

    @GetMapping("/{id}")
    public Response convert(@PathVariable("id") String id) throws Exception {

        Attachment attachment = dataConnector.getAttachment(id)
                .orElseThrow(AttachmentNotFoundException::new);

        String html = docXConverter.convertToHTML(attachment.getFile());
        return DTOTransformer.transform(attachment, html);
    }

}
