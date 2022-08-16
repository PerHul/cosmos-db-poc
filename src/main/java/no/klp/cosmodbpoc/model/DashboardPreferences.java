package no.klp.cosmodbpoc.model;

import java.util.List;

public class DashboardPreferences {
    private String defaultLayout;
    private List<LayoutKey> customerLayouts;
    public String getDefaultLayout() {
        return defaultLayout;
    }
    public void setDefaultLayout(String defaultLayout) {
        this.defaultLayout = defaultLayout;
    }
    public List<LayoutKey> getCustomerLayouts() {
        return customerLayouts;
    }
    public void setCustomerLayouts(List<LayoutKey> customerLayouts) {
        this.customerLayouts = customerLayouts;
    }

    
}
