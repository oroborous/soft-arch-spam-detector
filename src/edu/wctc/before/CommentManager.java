package edu.wctc.before;

import edu.wctc.services.DatabaseConnection;
import edu.wctc.services.ProjectHoneyPot;

public class CommentManager {
    public void addComment(String comment) {
        if (validateNotSpam()) {
            DatabaseConnection.saveComment(comment);
        }
    }

    private boolean validateNotSpam() {
        return ProjectHoneyPot.isSpam();
    }
}
