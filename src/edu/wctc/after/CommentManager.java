package edu.wctc.after;

import edu.wctc.services.DatabaseConnection;
import edu.wctc.services.ProjectHoneyPot;

public class CommentManager {
    private ICommentValidator validator;

    public CommentManager(ICommentValidator validator) {
        this.validator = validator;
    }

    public void addComment(String comment) {
        if (validateNotSpam()) {
            DatabaseConnection.saveComment(comment);
        }
    }

    private boolean validateNotSpam() {
//        return ProjectHoneyPot.isSpam();
        return validator.validate();
    }
}
