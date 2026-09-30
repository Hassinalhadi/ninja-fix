package Gc;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import delivery.samurai.android.ui.support.SupportFragment;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zendesk.support.Comment;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;

/* loaded from: classes2.dex */
public final class u extends ZendeskCallback {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ u(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // com.zendesk.service.ZendeskCallback
    public final void onError(ErrorResponse errorResponse) {
        switch (this.alpha) {
            case 0:
                ((ZenDeskChatActivity) this.bravo).tango();
                return;
            case 1:
                ((ZenDeskChatActivity) this.bravo).tango();
                return;
            default:
                SupportFragment supportFragment = (SupportFragment) this.bravo;
                if (supportFragment.getView() != null) {
                    ((SwipeRefreshLayout) supportFragment.romeo().teal).setRefreshing(false);
                    return;
                }
                return;
        }
    }

    @Override // com.zendesk.service.ZendeskCallback
    public final void onSuccess(Object obj) {
        List<CommentResponse> comments;
        int i4;
        int i5;
        switch (this.alpha) {
            case 0:
                CommentsResponse commentsResponse = (CommentsResponse) obj;
                if (commentsResponse != null && (comments = commentsResponse.getComments()) != null) {
                    ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) this.bravo;
                    LinearLayout emptyView = (LinearLayout) zenDeskChatActivity.gray().foxtrot;
                    Intrinsics.delta(emptyView, "emptyView");
                    if (comments.isEmpty()) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    emptyView.setVisibility(i4);
                    zenDeskChatActivity.f12507P.bravo(comments);
                    zenDeskChatActivity.tango();
                    return;
                }
                return;
            case 1:
                Comment comment = (Comment) obj;
                Intrinsics.echo(comment, "comment");
                ZenDeskChatActivity zenDeskChatActivity2 = (ZenDeskChatActivity) this.bravo;
                zenDeskChatActivity2.tango();
                String obj2 = ((EditText) zenDeskChatActivity2.gray().golf).getText().toString();
                Ca.c cVar = zenDeskChatActivity2.f12507P;
                cVar.getClass();
                CommentResponse commentResponse = new CommentResponse();
                commentResponse.setAuthorId(comment.getAuthorId());
                commentResponse.setBody(obj2);
                commentResponse.setCreatedAt(comment.getCreatedAt());
                commentResponse.setId(comment.getId());
                cVar.alpha.add(0, commentResponse);
                cVar.notifyDataSetChanged();
                zenDeskChatActivity2.gold();
                zenDeskChatActivity2.amber(false);
                return;
            default:
                List list = (List) obj;
                SupportFragment supportFragment = (SupportFragment) this.bravo;
                if (supportFragment.getView() != null) {
                    TextView emptyView2 = (TextView) supportFragment.romeo().red;
                    Intrinsics.delta(emptyView2, "emptyView");
                    if (list != null && !list.isEmpty()) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    emptyView2.setVisibility(i5);
                    ((SwipeRefreshLayout) supportFragment.romeo().teal).setRefreshing(false);
                    supportFragment.f12497f.bravo(list);
                    return;
                }
                return;
        }
    }
}
