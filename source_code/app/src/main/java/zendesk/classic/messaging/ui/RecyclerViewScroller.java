package zendesk.classic.messaging.ui;

import android.view.View;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ao;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RecyclerViewScroller {
    private static final int FIXED_SCROLL_TIME = 50;
    private static final int SCROLL_INSTANT = 1;
    private static final int SCROLL_SMOOTH_FIXED_TIME = 3;
    private static final int SCROLL_SMOOTH_FIXED_VELOCITY = 2;
    private final az adapter;
    private final LinearLayoutManager linearLayoutManager;
    private final RecyclerView recyclerView;
    private int lastCompletelyVisiblePosition = 0;
    private int secondCompletelyVisiblePosition = 0;

    public RecyclerViewScroller(final RecyclerView recyclerView, final LinearLayoutManager linearLayoutManager, final az azVar) {
        this.recyclerView = recyclerView;
        this.linearLayoutManager = linearLayoutManager;
        this.adapter = azVar;
        recyclerView.addOnScrollListener(new Q() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.1
            @Override // androidx.recyclerview.widget.Q
            public void onScrolled(RecyclerView recyclerView2, int i4, int i5) {
                super.onScrolled(recyclerView2, i4, i5);
                RecyclerViewScroller recyclerViewScroller = RecyclerViewScroller.this;
                recyclerViewScroller.secondCompletelyVisiblePosition = recyclerViewScroller.lastCompletelyVisiblePosition;
                RecyclerViewScroller recyclerViewScroller2 = RecyclerViewScroller.this;
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                int i10 = -1;
                View N10 = linearLayoutManager2.N(linearLayoutManager2.whiskey() - 1, -1, true, false);
                if (N10 != null) {
                    i10 = L.gray(N10);
                }
                recyclerViewScroller2.lastCompletelyVisiblePosition = i10;
            }
        });
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.2
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
                if (i11 < i15 && azVar.getItemCount() - 1 == RecyclerViewScroller.this.secondCompletelyVisiblePosition) {
                    RecyclerViewScroller.this.postScrollToBottom(1);
                }
            }
        });
        azVar.registerAdapterDataObserver(new B() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.3
            @Override // androidx.recyclerview.widget.B
            public void onItemRangeInserted(int i4, int i5) {
                if (!recyclerView.canScrollVertically(1)) {
                    RecyclerViewScroller.this.postScrollToBottom(3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postScrollToBottom(final int i4) {
        this.recyclerView.post(new Runnable() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.7
            @Override // java.lang.Runnable
            public void run() {
                RecyclerViewScroller.this.scrollToBottom(i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToBottom(int i4) {
        int i5;
        int itemCount = this.adapter.getItemCount() - 1;
        if (itemCount >= 0) {
            if (i4 == 1) {
                f0 findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(itemCount);
                if (findViewHolderForAdapterPosition != null) {
                    i5 = findViewHolderForAdapterPosition.itemView.getHeight();
                } else {
                    i5 = 0;
                }
                int paddingBottom = (this.recyclerView.getPaddingBottom() + i5) * (-1);
                LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
                linearLayoutManager.xray = itemCount;
                linearLayoutManager.yankee = paddingBottom;
                LinearLayoutManager.SavedState savedState = linearLayoutManager.zulu;
                if (savedState != null) {
                    savedState.alpha = -1;
                }
                linearLayoutManager.l();
                return;
            }
            if (i4 == 3) {
                ao aoVar = new ao(this.recyclerView.getContext()) { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.6
                    @Override // androidx.recyclerview.widget.ao
                    public int calculateTimeForScrolling(int i10) {
                        return 50;
                    }
                };
                aoVar.setTargetPosition(itemCount);
                this.linearLayoutManager.y(aoVar);
            } else if (i4 == 2) {
                ao aoVar2 = new ao(this.recyclerView.getContext());
                aoVar2.setTargetPosition(itemCount);
                this.linearLayoutManager.y(aoVar2);
            }
        }
    }

    public void install(final InputBox inputBox) {
        inputBox.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.4
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i4, final int i5, int i10, int i11, int i12, final int i13, int i14, int i15) {
                RecyclerViewScroller.this.recyclerView.post(new Runnable() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int paddingLeft = RecyclerViewScroller.this.recyclerView.getPaddingLeft();
                        int paddingRight = RecyclerViewScroller.this.recyclerView.getPaddingRight();
                        int paddingTop = RecyclerViewScroller.this.recyclerView.getPaddingTop();
                        int height = inputBox.getHeight();
                        if (height != RecyclerViewScroller.this.recyclerView.getPaddingBottom()) {
                            RecyclerViewScroller.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, height);
                            RecyclerViewScroller.this.recyclerView.scrollBy(0, i13 - i5);
                        }
                    }
                });
            }
        });
        inputBox.addSendButtonClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.RecyclerViewScroller.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RecyclerViewScroller.this.postScrollToBottom(1);
            }
        });
    }
}
