package zendesk.support.requestlist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.f0;
import com.squareup.picasso.Picasso;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import zendesk.support.R;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;
import zendesk.support.requestlist.RequestListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestListViewHolder extends f0 {
    private final int avatarRadius;
    private final ZendeskAvatarView avatarView;
    private final TextView commentText;
    private final Context context;
    private final RequestListView.OnItemClick listener;
    private final Picasso picasso;
    private final TextView subjectText;
    private final TextView timeText;
    private final TextView userText;

    private RequestListViewHolder(View view, RequestListView.OnItemClick onItemClick, Picasso picasso) {
        super(view);
        this.listener = onItemClick;
        this.picasso = picasso;
        Context context = view.getContext();
        this.context = context;
        this.avatarView = (ZendeskAvatarView) view.findViewById(R.id.request_list_item_avatar);
        this.timeText = (TextView) view.findViewById(R.id.request_list_item_time);
        this.userText = (TextView) view.findViewById(R.id.request_list_item_user);
        this.subjectText = (TextView) view.findViewById(R.id.request_list_item_subject);
        this.commentText = (TextView) view.findViewById(R.id.request_list_item_body);
        this.avatarRadius = context.getResources().getDimensionPixelOffset(R.dimen.zs_request_list_avatar_radius);
    }

    private void bindAvatar(boolean z2, List<String> list, String str) {
        if (z2) {
            if (StringUtils.hasLength(str)) {
                this.avatarView.showUserWithAvatarImage(this.picasso, str, list.get(0), this.avatarRadius);
                return;
            } else {
                this.avatarView.showUserWithName(list.get(0));
                return;
            }
        }
        this.avatarView.showUserWithIdentifier(Integer.valueOf(R.string.request_list_me));
    }

    public static RequestListViewHolder create(Context context, ViewGroup viewGroup, RequestListView.OnItemClick onItemClick, Picasso picasso) {
        return new RequestListViewHolder(LayoutInflater.from(context).inflate(R.layout.zs_request_list_ticket_item, viewGroup, false), onItemClick, picasso);
    }

    private String generateUserText(String str, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        return TextUtils.join(", ", arrayList);
    }

    private CharSequence getDateTimeString(Date date) {
        return DateUtils.getRelativeTimeSpanString(this.context, date.getTime(), false);
    }

    private void style(boolean z2, boolean z10, boolean z11) {
        if (z2) {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(1));
            this.userText.setTypeface(Typeface.defaultFromStyle(1));
            this.commentText.setTextColor(this.context.getColor(R.color.zs_request_list_dark_text_color));
            this.timeText.setTextColor(UiUtils.themeAttributeToColor(R.attr.colorPrimary, this.context, R.color.zs_request_list_light_text_color));
        } else {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(0));
            this.userText.setTypeface(Typeface.defaultFromStyle(0));
            TextView textView = this.commentText;
            Context context = this.context;
            int i4 = R.color.zs_request_list_light_text_color;
            textView.setTextColor(context.getColor(i4));
            this.timeText.setTextColor(this.context.getColor(i4));
        }
        if (z10) {
            this.commentText.setTextColor(this.context.getColor(R.color.zs_request_cell_label_color_error));
        }
        this.itemView.setBackgroundColor(this.context.getColor(R.color.zs_request_list_white));
    }

    public void bind(final RequestListItem requestListItem) {
        String firstMessage;
        CharSequence charSequence;
        this.userText.setText(generateUserText(this.context.getString(R.string.request_list_me), requestListItem.getLastCommentingAgentNames()));
        TextView textView = this.subjectText;
        if (requestListItem.hasAgentReplied()) {
            firstMessage = this.context.getString(R.string.request_list_re, requestListItem.getFirstMessage());
        } else {
            firstMessage = requestListItem.getFirstMessage();
        }
        textView.setText(firstMessage);
        if (requestListItem.isClosed()) {
            this.commentText.setText(R.string.request_list_ticket_closed);
        } else if (requestListItem.isFailed()) {
            this.commentText.setText(R.string.ask_request_list_failed_request_message);
        } else {
            this.commentText.setText(requestListItem.getLastMessage());
        }
        Date lastUpdated = requestListItem.getLastUpdated();
        TextView textView2 = this.timeText;
        if (lastUpdated != null) {
            charSequence = getDateTimeString(lastUpdated);
        } else {
            charSequence = "";
        }
        textView2.setText(charSequence);
        bindAvatar(requestListItem.hasAgentReplied(), requestListItem.getLastCommentingAgentNames(), requestListItem.getAvatar());
        style(requestListItem.isUnread(), requestListItem.isFailed(), requestListItem.isClosed());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListViewHolder.this.listener.onClick(requestListItem);
            }
        });
    }
}
