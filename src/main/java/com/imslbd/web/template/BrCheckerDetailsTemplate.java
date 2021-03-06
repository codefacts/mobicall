package com.imslbd.web.template;

import io.crm.web.template.Page;
import org.watertemplate.Template;
import org.watertemplate.TemplateMap;

import static io.crm.util.Util.getOrDefault;
import static io.crm.web.template.TemplateUtil.EMPTY_TEMPLATE;

/**
 * Created by sohan on 10/3/2015.
 */
public class BrCheckerDetailsTemplate extends Template {
    final Template filtersPanel;
    final Template dataPanel;

    BrCheckerDetailsTemplate(Template filtersPanel, Template dataPanel) {
        this.filtersPanel = filtersPanel;
        this.dataPanel = dataPanel;
    }

    @Override
    protected void addSubTemplates(TemplateMap.SubTemplates subTemplates) {
        subTemplates.add("filtersPanel", getOrDefault(filtersPanel, EMPTY_TEMPLATE));
        subTemplates.add("dataPanel", getOrDefault(dataPanel, EMPTY_TEMPLATE));
    }

    @Override
    protected String getFilePath() {
        return Page.templatePath("br-checker-details.html");
    }
}
