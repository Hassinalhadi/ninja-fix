package zendesk.support.suas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CombinedSubscription implements Subscription {
    private final Collection<Subscription> subscriptions;

    private CombinedSubscription(Collection<Subscription> collection) {
        this.subscriptions = collection;
    }

    public static Subscription from(Subscription... subscriptionArr) {
        return new CombinedSubscription(Arrays.asList(subscriptionArr));
    }

    @Override // zendesk.support.suas.Subscription
    public void addListener() {
        Iterator<Subscription> it = this.subscriptions.iterator();
        while (it.hasNext()) {
            it.next().addListener();
        }
    }

    @Override // zendesk.support.suas.Subscription
    public void informWithCurrentState() {
        Iterator<Subscription> it = this.subscriptions.iterator();
        while (it.hasNext()) {
            it.next().informWithCurrentState();
        }
    }

    @Override // zendesk.support.suas.Subscription
    public void removeListener() {
        Iterator<Subscription> it = this.subscriptions.iterator();
        while (it.hasNext()) {
            it.next().removeListener();
        }
    }

    public static Subscription from(Collection<Subscription> collection) {
        return new CombinedSubscription(collection);
    }
}
