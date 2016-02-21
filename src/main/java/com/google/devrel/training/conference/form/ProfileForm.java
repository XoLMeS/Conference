package com.google.devrel.training.conference.form;

/**
 * Pojo representing a profile form on the client side.
 */
public class ProfileForm {
    /**
     * Any string user wants us to display him/her on this system.
     */
    private String displayName = null;

    /**
     * T shirt size.
     */
    private TeeShirtSize teeShirtSize = TeeShirtSize.NOT_SPECIFIED;

    private ProfileForm () {}

    /**
     * Constructor for ProfileForm, solely for unit test.
     * @param displayName A String for displaying the user on this system.
     * @param notificationEmail An e-mail address for getting notifications from this system.
     */
    public ProfileForm(String displayName, TeeShirtSize teeShirtSize) {
    	if(displayName!= null){
    		this.displayName = displayName;
    	}
    	
    	if(teeShirtSize!=null){
    		this.teeShirtSize = teeShirtSize;
    	}
    	else this.teeShirtSize = teeShirtSize.NOT_SPECIFIED;
    }

    public String getDisplayName() {
        return displayName;
    }

    public TeeShirtSize getTeeShirtSize() {
        return teeShirtSize;
    }
    
    public static enum TeeShirtSize {
    	NOT_SPECIFIED,
        XS,
        S,
        M,
        L, 
        XL, 
        XXL,
        XXXL
    }
}
