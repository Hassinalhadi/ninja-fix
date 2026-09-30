package zendesk.support.suas;

/* loaded from: classes.dex */
public interface Store extends GetState, Dispatcher {
    Subscription addActionListener(Listener<Action<?>> listener);

    <E> Subscription addListener(Class<E> cls, Filter<E> filter, Listener<E> listener);

    <E> Subscription addListener(Class<E> cls, Listener<E> listener);

    <E> Subscription addListener(String str, Class<E> cls, Filter<E> filter, Listener<E> listener);

    <E> Subscription addListener(String str, Class<E> cls, Listener<E> listener);

    <E> Subscription addListener(String str, Filter<E> filter, Listener<E> listener);

    <E> Subscription addListener(String str, Listener<E> listener);

    Subscription addListener(Filter<State> filter, Listener<State> listener);

    <E> Subscription addListener(Filter<State> filter, StateSelector<E> stateSelector, Listener<E> listener);

    Subscription addListener(Listener<State> listener);

    <E> Subscription addListener(StateSelector<E> stateSelector, Listener<E> listener);

    void removeListener(Listener<?> listener);

    void reset(State state);
}
