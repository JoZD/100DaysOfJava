import java.util.regex.Matcher;
import java.util.regex.Pattern;



//test if mail is valid 
public class TestIfMailIsValid {
    
  // This regular expression pattern defines what a valid email address looks like.
  private static final String EMAIL_REGEX =
      "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

  // This pattern object is used to check if a given string matches the email regex.
  private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

  /**
   * Checks if the given email address is valid.
   *
   * @param email the email address to check
   * @return true if the email address is valid, false otherwise
   */
  public static boolean isValidEmail(String email) {
    // First, check if the email address is null or empty.
    if (email == null || email.isEmpty()) {
      return false;
    }

    // Next, create a matcher object from the email pattern and attempt to match it to the email.
    Matcher matcher = EMAIL_PATTERN.matcher(email);

    // If the matcher finds a match, then the email is valid.
    return matcher.matches();
  }



}
