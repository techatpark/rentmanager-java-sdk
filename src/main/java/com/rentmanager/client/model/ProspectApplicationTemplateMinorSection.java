package com.rentmanager.client.model;

import java.beans.JavaBean;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@JavaBean(defaultProperty = "ProspectApplicationTemplateMinorSections")
public class ProspectApplicationTemplateMinorSection {

    @JsonProperty("ApplicationMinorSectionID")
    public Integer applicationMinorSectionID;
    @JsonProperty("ApplicationMajorSectionID")
    public Integer applicationMajorSectionID;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Text")
    public String text;
    @JsonProperty("HelpText")
    public String helpText;
    @JsonProperty("ApplicationFields")
    public List<ApplicationField> applicationFields = null;

}