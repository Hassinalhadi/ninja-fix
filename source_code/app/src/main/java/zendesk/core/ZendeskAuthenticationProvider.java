package zendesk.core;

/* loaded from: classes.dex */
class ZendeskAuthenticationProvider implements AuthenticationProvider {
    private final IdentityManager identityManager;

    public ZendeskAuthenticationProvider(IdentityManager identityManager) {
        this.identityManager = identityManager;
    }

    @Override // zendesk.core.AuthenticationProvider
    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }
}
