package no.klp.cosmodbpoc.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;

import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "userProfiles", ru = "400")
public class UserProfile {

    @PartitionKey
    @Id
    private String id;

    private List<IntroductionKey> completedIntroductions;

    private DashboardPreferences dashboardPreferences;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DashboardPreferences getDashboardPreferences() {
        return dashboardPreferences;
    }

    public void setDashboardPreferences(DashboardPreferences dashboardPreferences) {
        this.dashboardPreferences = dashboardPreferences;
    }
    public List<IntroductionKey> getCompletedIntroductions() {
        return completedIntroductions;
    }
    public void setCompletedIntroductions(List<IntroductionKey> completedIntroductions) {
        this.completedIntroductions = completedIntroductions;
    }
    
}
