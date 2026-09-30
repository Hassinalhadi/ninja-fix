package zendesk.support.suas;

/* loaded from: classes.dex */
public interface Subscription {
    void addListener();

    void informWithCurrentState();

    void removeListener();
}
