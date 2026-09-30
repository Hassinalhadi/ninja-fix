package zendesk.core;

import vg.d;
import yg.a;
import yg.o;

/* loaded from: classes.dex */
interface AccessService {
    @o("/access/sdk/anonymous")
    d<AuthenticationResponse> getAuthTokenForAnonymous(@a AuthenticationRequestWrapper authenticationRequestWrapper);

    @o("/access/sdk/jwt")
    d<AuthenticationResponse> getAuthTokenForJwt(@a AuthenticationRequestWrapper authenticationRequestWrapper);
}
