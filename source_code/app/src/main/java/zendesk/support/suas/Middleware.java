package zendesk.support.suas;

/* loaded from: classes.dex */
public interface Middleware {
    void onAction(Action<?> action, GetState getState, Dispatcher dispatcher, Continuation continuation);
}
