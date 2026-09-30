package zendesk.support.suas;

/* loaded from: classes.dex */
public class Filters {
    public static final Filter DEFAULT;
    public static final Filter EQUALS;

    /* loaded from: classes.dex */
    public static class DefaultFilter implements Filter {
        public /* synthetic */ DefaultFilter(int i4) {
            this();
        }

        @Override // zendesk.support.suas.Filter
        public boolean filter(Object obj, Object obj2) {
            return true;
        }

        private DefaultFilter() {
        }
    }

    /* loaded from: classes.dex */
    public static class EqualsFilter implements Filter {
        public /* synthetic */ EqualsFilter(int i4) {
            this();
        }

        @Override // zendesk.support.suas.Filter
        public boolean filter(Object obj, Object obj2) {
            return !obj.equals(obj2);
        }

        private EqualsFilter() {
        }
    }

    static {
        int i4 = 0;
        DEFAULT = new DefaultFilter(i4);
        EQUALS = new EqualsFilter(i4);
    }

    private Filters() {
    }
}
