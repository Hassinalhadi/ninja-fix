package zendesk.support.request;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.AbstractC0659d;
import androidx.recyclerview.widget.AbstractC0674t;
import androidx.recyclerview.widget.C0676v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ar;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.request.CellType;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentRequestAdapter implements Listener<List<CellType.Base>> {
    private static final long UPDATE_TIME_WINDOW = 200;
    private final ar listUpdateCallback;
    private final RecyclerView recyclerView;
    private final RequestAdapterSelector requestAdapterSelector;
    private final List<CellType.Base> requestMessageList;
    private Runnable updateRunnable;

    /* loaded from: classes.dex */
    public static class DiffCalculator extends AbstractC0674t {
        private final List<CellType.Base> newList;
        private final List<CellType.Base> oldList;

        public /* synthetic */ DiffCalculator(List list, List list2, int i4) {
            this(list, list2);
        }

        @Override // androidx.recyclerview.widget.AbstractC0674t
        public boolean areContentsTheSame(int i4, int i5) {
            return this.oldList.get(i4).areContentsTheSame(this.newList.get(i5));
        }

        @Override // androidx.recyclerview.widget.AbstractC0674t
        public boolean areItemsTheSame(int i4, int i5) {
            if (this.oldList.get(i4).getUniqueId() == this.newList.get(i5).getUniqueId()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC0674t
        public int getNewListSize() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.AbstractC0674t
        public int getOldListSize() {
            return this.oldList.size();
        }

        private DiffCalculator(List<CellType.Base> list, List<CellType.Base> list2) {
            this.oldList = list;
            this.newList = list2;
        }
    }

    /* loaded from: classes.dex */
    public static class RequestAdapter extends az {
        private final ComponentRequestAdapter dataSource;
        private int lastPosition = -1;

        public RequestAdapter(ComponentRequestAdapter componentRequestAdapter) {
            setHasStableIds(true);
            this.dataSource = componentRequestAdapter;
        }

        @Override // androidx.recyclerview.widget.az
        public int getItemCount() {
            return this.dataSource.getMessageCount();
        }

        @Override // androidx.recyclerview.widget.az
        public long getItemId(int i4) {
            return this.dataSource.getMessageForPos(i4).getUniqueId();
        }

        @Override // androidx.recyclerview.widget.az
        public int getItemViewType(int i4) {
            return this.dataSource.getMessageForPos(i4).getLayoutId();
        }

        @Override // androidx.recyclerview.widget.az
        @SuppressLint({"RecyclerView"})
        public void onBindViewHolder(RequestViewHolder requestViewHolder, int i4) {
            this.dataSource.getMessageForPos(i4).bind(requestViewHolder);
            int i5 = this.lastPosition;
            if (i4 > i5 && i5 != -1) {
                this.lastPosition = i4;
                requestViewHolder.startAnimation();
            }
            if (this.lastPosition == -1) {
                this.lastPosition = i4;
            }
        }

        @Override // androidx.recyclerview.widget.az
        public RequestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            return new RequestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.az
        public void onViewDetachedFromWindow(RequestViewHolder requestViewHolder) {
            super.onViewDetachedFromWindow((f0) requestViewHolder);
            requestViewHolder.clearAnimation();
        }
    }

    /* loaded from: classes.dex */
    public static class RequestAdapterSelector implements StateSelector<List<CellType.Base>> {
        private final CellFactory messageFactory;

        public RequestAdapterSelector(CellFactory cellFactory) {
            this.messageFactory = cellFactory;
        }

        @Override // zendesk.support.suas.StateSelector
        public List<CellType.Base> selectData(State state) {
            StateConversation fromState = StateConversation.fromState(state);
            StateSettings settings = StateConfig.fromState(state).getSettings();
            return this.messageFactory.generateCells(fromState.getMessages(), fromState.getUsers(), fromState.getStatus(), settings.getSystemMessage());
        }
    }

    /* loaded from: classes.dex */
    public static class RequestViewHolder extends f0 {
        private static final long ANIMATION_DURATION = 250;
        private static final float ANIMATION_HEIGHT_RATIO = 0.6666667f;
        private static final TimeInterpolator TIME_INTERPOLATOR = new PathInterpolator(0.2f, 0.0f, 0.4f, 1.0f);
        private ValueAnimator animation;

        @SuppressLint({"UseSparseArrays"})
        private final Map<Integer, View> viewCache;

        public RequestViewHolder(View view) {
            super(view);
            this.viewCache = new HashMap();
        }

        public void clearAnimation() {
            ValueAnimator valueAnimator = this.animation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.itemView.setTranslationY(0.0f);
            }
        }

        public <E extends View> E findCachedView(int i4) {
            E e;
            synchronized (this.viewCache) {
                try {
                    if (this.viewCache.containsKey(Integer.valueOf(i4))) {
                        e = (E) this.viewCache.get(Integer.valueOf(i4));
                    } else {
                        View findViewById = this.itemView.findViewById(i4);
                        this.viewCache.put(Integer.valueOf(i4), findViewById);
                        e = (E) findViewById;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return e;
        }

        public void startAnimation() {
            int measuredHeight = this.itemView.getMeasuredHeight();
            if (measuredHeight == 0) {
                this.itemView.measure(0, 0);
                measuredHeight = this.itemView.getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(measuredHeight * ANIMATION_HEIGHT_RATIO, 0.0f);
            this.animation = ofFloat;
            ofFloat.setInterpolator(TIME_INTERPOLATOR);
            this.animation.setDuration(ANIMATION_DURATION);
            this.animation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zendesk.support.request.ComponentRequestAdapter.RequestViewHolder.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RequestViewHolder.this.itemView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            this.animation.start();
        }
    }

    public ComponentRequestAdapter(ar arVar, CellFactory cellFactory, RecyclerView recyclerView) {
        this.updateRunnable = null;
        this.listUpdateCallback = arVar;
        this.recyclerView = recyclerView;
        this.requestMessageList = new ArrayList();
        this.requestAdapterSelector = new RequestAdapterSelector(cellFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDataSet(List<CellType.Base> list, List<CellType.Base> list2) {
        C0676v alpha = AbstractC0659d.alpha(new DiffCalculator(list, list2, 0));
        this.requestMessageList.clear();
        this.requestMessageList.addAll(list2);
        alpha.alpha(this.listUpdateCallback);
    }

    public int getMessageCount() {
        return this.requestMessageList.size();
    }

    public CellType.Base getMessageForPos(int i4) {
        return this.requestMessageList.get(i4);
    }

    public StateSelector<List<CellType.Base>> getSelector() {
        return this.requestAdapterSelector;
    }

    @Override // zendesk.support.suas.Listener
    public void update(final List<CellType.Base> list) {
        this.recyclerView.removeCallbacks(this.updateRunnable);
        Runnable runnable = new Runnable() { // from class: zendesk.support.request.ComponentRequestAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                ComponentRequestAdapter.this.updateDataSet(CollectionUtils.copyOf(ComponentRequestAdapter.this.requestMessageList), CollectionUtils.copyOf(list));
            }
        };
        this.updateRunnable = runnable;
        this.recyclerView.postDelayed(runnable, 200L);
    }

    public ComponentRequestAdapter(List<CellType.Base> list, ar arVar, RequestAdapterSelector requestAdapterSelector, RecyclerView recyclerView) {
        this.updateRunnable = null;
        this.requestMessageList = list;
        this.listUpdateCallback = arVar;
        this.requestAdapterSelector = requestAdapterSelector;
        this.recyclerView = recyclerView;
    }
}
