package de.litexo.commands.model;

import java.util.Objects;

public class Client {
    private String index;
    private String name;
    private String company;
    private String ip;

    public String getIndex() { return index; }
    public void setIndex(String index) { this.index = index; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client c = (Client) o;
        return Objects.equals(index, c.index) && Objects.equals(name, c.name) &&
               Objects.equals(company, c.company) && Objects.equals(ip, c.ip);
    }

    @Override
    public int hashCode() { return Objects.hash(index, name, company, ip); }

    @Override
    public String toString() {
        return "Client(index=" + index + ", name=" + name + ", company=" + company + ", ip=" + ip + ")";
    }
}
