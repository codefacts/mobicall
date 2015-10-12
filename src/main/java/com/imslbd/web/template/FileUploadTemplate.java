package com.imslbd.web.template;

import io.crm.web.template.Page;
import org.watertemplate.Template;

/**
 * Created by someone on 01/10/2015.
 */
public class FileUploadTemplate extends Template {
    public FileUploadTemplate(final String statusContent) {
        add("statusContent", statusContent);
    }

    @Override
    protected String getFilePath() {
        return Page.templatePath("file-upload.html");
    }
}
