package com.asm.RestController;

import com.asm.Services.UploadService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.io.File;

public class UploadAPI {
    @Autowired
    UploadService uploadService;

    @PostMapping("/api/upload/{folder}")
    public JsonNode upload(@PathParam("file")MultipartFile file, @PathVariable("folder") String folder){
        File savedFile = uploadService.save(file, folder);
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("name",savedFile.getName());
        node.put("size",savedFile.length());
        return node;
    }
}
