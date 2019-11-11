package com.softtron.pinmaoorder.controllers;

import java.io.File;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.softtron.pinmaoserver.utils.ExceptionUtil;

@RestController
public class UploadController extends CommonController {
	@RequestMapping(path = { "upload" })
	public Map file(MultipartFile file) throws Exception {
		if (file==null||file.isEmpty()) {
			throw ExceptionUtil.NOTFILEEXCEPTION;
		}
		String fileName = file.getOriginalFilename();
        File dest = new File(filePath + fileName);
            file.transferTo(dest);
		return resultMap;
	}

}
