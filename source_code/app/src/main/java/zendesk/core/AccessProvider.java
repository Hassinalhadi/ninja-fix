package zendesk.core;

import vg.aq;

/* loaded from: classes.dex */
interface AccessProvider {
    public static final String NO_JWT_ERROR_MESSAGE = "The jwt user identifier is null or empty. We cannot proceed to get an access token";

    aq<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity);

    aq<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity);
}
