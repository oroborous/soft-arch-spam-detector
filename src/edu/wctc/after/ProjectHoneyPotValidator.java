package edu.wctc.after;

import edu.wctc.services.ProjectHoneyPot;

public class ProjectHoneyPotValidator implements ICommentValidator {
    @Override
    public boolean validate() {
        return ProjectHoneyPot.isSpam();
    }
}
