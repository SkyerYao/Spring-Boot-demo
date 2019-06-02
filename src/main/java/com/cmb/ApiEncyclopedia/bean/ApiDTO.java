package com.cmb.ApiEncyclopedia.bean;

/**
 * Created by SENSETIME\yuanzhen on 19-5-31 下午1:39
 */
public class ApiDTO {
    private int id;
    private String name;
    private String detail;
    private String type;
    private String department;
    private String owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ApiDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                ", department='" + department + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
