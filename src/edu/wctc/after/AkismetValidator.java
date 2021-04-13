package edu.wctc.after;

import edu.wctc.services.Akismet;

public class AkismetValidator implements ICommentValidator {
    @Override
    public boolean validate() {
        return Akismet.isBlacklisted();
    }
}
