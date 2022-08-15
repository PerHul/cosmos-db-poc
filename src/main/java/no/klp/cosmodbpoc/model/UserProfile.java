package no.klp.cosmodbpoc.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "userProfiles", ru = "400")
public class UserProfile {

    @Id
    private String userId;
    private List<InstructionKey> completedInstructions;
    private DashboardPreferences dashboardPreferences;
    
    public String getUserId() {
        return userId;
    }
    public List<InstructionKey> getCompletedInstructions() {
        return completedInstructions;
    }
    public DashboardPreferences getDashboardPreferences() {
        return dashboardPreferences;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setCompletedInstructions(List<InstructionKey> completedInstructions) {
        this.completedInstructions = completedInstructions;
    }
    public void setDashboardPreferences(DashboardPreferences dashboardPreferences) {
        this.dashboardPreferences = dashboardPreferences;
    }

    
}
