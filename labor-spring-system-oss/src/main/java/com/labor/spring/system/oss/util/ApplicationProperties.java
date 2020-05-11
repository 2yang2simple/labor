package com.labor.spring.system.oss.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.labor.spring.base.BaseProperties;

@Component
public class ApplicationProperties extends BaseProperties {
	
	@Value("${attachments.dir}")
	public String ATTACHMENTS_DIR;
	
	@Value("${documents.dir}")
	public String DOCUMENTS_DIR;
	
	@Value("${objectstorage.dir}")
	public String OBJECTSTORAGE_DIR;
	
	@Value("${img.dir}")
	public String IMG_DIR;
	
	@Value("${img.404.file}")
	public String IMG_404_FILE;

	@Value("${img.watermark.file}")
	public String IMG_WATERMARK_FILE;
	
	@Value("${img.not.exist}")
	public String IMG_NOT_EXIST;


	
}
