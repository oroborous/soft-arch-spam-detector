package edu.wctc;

import edu.wctc.after.AkismetValidator;
import edu.wctc.after.ICommentValidator;

public class Main {
    public static void main(String[] args) {
        // Before
        edu.wctc.before.CommentManager oldManager = new edu.wctc.before.CommentManager();
        
        // After
        ICommentValidator validator = new AkismetValidator();
//        ICommentValidator validator = new ProjectHoneyPotValidator();
        edu.wctc.after.CommentManager newManager = new edu.wctc.after.CommentManager(validator);

    }
}
