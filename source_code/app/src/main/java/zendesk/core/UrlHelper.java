package zendesk.core;

/* loaded from: classes.dex */
public class UrlHelper {
    public static boolean isGuideRequest(String str) {
        if (!str.contains("/api/v2/help_center") && !str.contains("/hc/api") && !str.contains("/api/mobile/help_center")) {
            return false;
        }
        return true;
    }

    public static boolean isVoteRequest(String str) {
        if (!str.contains("/up.json") && !str.contains("/down.json") && !str.contains("/api/v2/help_center/votes/")) {
            return false;
        }
        return true;
    }
}
