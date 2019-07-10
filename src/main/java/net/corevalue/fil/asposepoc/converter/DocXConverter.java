package net.corevalue.fil.asposepoc.converter;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@Service
public class DocXConverter {

    public String convertToHTML(byte[] docX) throws Exception {

        ByteArrayInputStream inputStream = new ByteArrayInputStream(docX);
        Document document = new Document(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        document.save(outputStream, SaveFormat.HTML);

        return document.toString();
    }
}
