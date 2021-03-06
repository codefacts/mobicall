package com.imslbd.web.template;

import org.watertemplate.Template;

public class BrCheckerDetailsTemplateBuilder {
    private Template filtersPanel;
    private Template dataPanel;

    public BrCheckerDetailsTemplateBuilder setFiltersPanel(Template filtersPanel) {
        this.filtersPanel = filtersPanel;
        return this;
    }

    public BrCheckerDetailsTemplateBuilder setDataPanel(Template dataPanel) {
        this.dataPanel = dataPanel;
        return this;
    }

    public BrCheckerDetailsTemplate createBrCheckerDetailsTemplate() {
        return new BrCheckerDetailsTemplate(filtersPanel, dataPanel);
    }
}