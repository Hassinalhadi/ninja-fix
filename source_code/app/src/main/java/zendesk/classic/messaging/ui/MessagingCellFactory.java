package zendesk.classic.messaging.ui;

import android.content.Context;
import android.view.View;
import com.squareup.picasso.Picasso;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import zendesk.classic.messaging.AgentDetails;
import zendesk.classic.messaging.AttachmentSettings;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.EventFactory;
import zendesk.classic.messaging.EventListener;
import zendesk.classic.messaging.MessagingActivityScope;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;
import zendesk.classic.messaging.components.DateProvider;
import zendesk.classic.messaging.ui.ActionOptionsView;
import zendesk.classic.messaging.ui.AgentFileCellView;
import zendesk.classic.messaging.ui.AgentImageCellView;
import zendesk.classic.messaging.ui.AgentMessageView;
import zendesk.classic.messaging.ui.ArticlesResponseView;
import zendesk.classic.messaging.ui.MessagingState;
import zendesk.classic.messaging.ui.SystemMessageView;
import zendesk.classic.messaging.ui.TypingIndicatorView;

@MessagingActivityScope
/* loaded from: classes.dex */
public class MessagingCellFactory {
    private final AvatarStateFactory avatarStateFactory;
    private final AvatarStateRenderer avatarStateRenderer;
    private final MessagingCellPropsFactory cellPropsFactory;
    private final DateProvider dateProvider;
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final boolean multilineResponseOptionsEnabled;
    static final String TYPING_INDICATOR_ID = UUID.randomUUID().toString();
    private static final AgentDetails DEFAULT_TYPING_INDICATOR_LABEL_STATE = new AgentDetails("", "", false);

    /* loaded from: classes.dex */
    public static class MessageActionAdapter implements MessageActionListener {
        private final EventFactory eventFactory;
        private final EventListener eventListener;
        private final MessagingItem.Query messagingItem;

        public MessageActionAdapter(EventListener eventListener, MessagingItem.Query query, EventFactory eventFactory) {
            this.eventListener = eventListener;
            this.messagingItem = query;
            this.eventFactory = eventFactory;
        }

        @Override // zendesk.classic.messaging.ui.MessageActionListener
        public void copy(String str) {
            this.eventListener.onEvent(this.eventFactory.copyQueryClick(this.messagingItem));
        }

        @Override // zendesk.classic.messaging.ui.MessageActionListener
        public void delete(String str) {
            this.eventListener.onEvent(this.eventFactory.deleteQueryClick(this.messagingItem));
        }

        @Override // zendesk.classic.messaging.ui.MessageActionListener
        public void retry(String str) {
            MessagingItem.Query query = this.messagingItem;
            if (query instanceof MessagingItem.FileQuery) {
                this.eventListener.onEvent(this.eventFactory.retrySendAttachmentClick((MessagingItem.FileQuery) query));
            } else {
                this.eventListener.onEvent(this.eventFactory.retryQueryClick(query));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class TypingItem extends MessagingItem.Response {
        public /* synthetic */ TypingItem(Date date, String str, AgentDetails agentDetails, int i4) {
            this(date, str, agentDetails);
        }

        private TypingItem(Date date, String str, AgentDetails agentDetails) {
            super(date, str, agentDetails);
        }
    }

    public MessagingCellFactory(MessagingCellPropsFactory messagingCellPropsFactory, DateProvider dateProvider, EventListener eventListener, EventFactory eventFactory, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory, boolean z2) {
        this.cellPropsFactory = messagingCellPropsFactory;
        this.dateProvider = dateProvider;
        this.eventListener = eventListener;
        this.eventFactory = eventFactory;
        this.avatarStateRenderer = avatarStateRenderer;
        this.avatarStateFactory = avatarStateFactory;
        this.multilineResponseOptionsEnabled = z2;
    }

    private static MessagingCell<ActionOptionsView.State, ActionOptionsView> createActionOptionsCell(MessagingItem.TransferResponse transferResponse, MessagingCellProps messagingCellProps, final EventListener eventListener, final EventFactory eventFactory, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        ArrayList arrayList = new ArrayList();
        for (final Engine.TransferOptionDescription transferOptionDescription : transferResponse.getEngineOptions()) {
            arrayList.add(new ActionOptionsView.ActionOptionState(transferOptionDescription.getDisplayName(), new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.MessagingCellFactory.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EventListener.this.onEvent(eventFactory.transferOptionClick(transferOptionDescription));
                }
            }));
        }
        return new MessagingCell<>(transferResponse.getId(), new ActionOptionsView.State(transferResponse.getMessage(), transferResponse.getAgentDetails().getAgentName(), transferResponse.getAgentDetails().isBot(), messagingCellProps, arrayList, transferResponse.isEnabled(), avatarStateFactory.createAvatarState(transferResponse.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_action_options, ActionOptionsView.class);
    }

    private static MessagingCell<AgentFileCellView.State, AgentFileCellView> createAgentFileCell(MessagingItem.FileResponse fileResponse, MessagingCellProps messagingCellProps, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        return new MessagingCell<>(fileResponse.getId(), new AgentFileCellView.State(fileResponse.getAttachment(), messagingCellProps, fileResponse.getAgentDetails().getAgentName(), fileResponse.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(fileResponse.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_agent_file_view, AgentFileCellView.class);
    }

    private static MessagingCell<AgentImageCellView.State, AgentImageCellView> createAgentImageCell(MessagingItem.ImageResponse imageResponse, MessagingCellProps messagingCellProps, Picasso picasso, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        return new MessagingCell<>(imageResponse.getId(), new AgentImageCellView.State(picasso, messagingCellProps, imageResponse.getAttachment(), imageResponse.getAgentDetails().getAgentName(), imageResponse.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(imageResponse.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_agent_image_view, AgentImageCellView.class);
    }

    private static ArticlesResponseView.ArticleSuggestionViewState createArticleSuggestionViewState(final MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion, final EventListener eventListener, final EventFactory eventFactory) {
        return new ArticlesResponseView.ArticleSuggestionViewState(articleSuggestion.getTitle(), articleSuggestion.getSnippet(), new OnArticleSuggestionSelectionListener() { // from class: zendesk.classic.messaging.ui.MessagingCellFactory.1
            @Override // zendesk.classic.messaging.ui.OnArticleSuggestionSelectionListener
            public void onArticleSuggestionSelected(Context context) {
                EventListener.this.onEvent(eventFactory.articleSuggestionClick(articleSuggestion));
            }
        });
    }

    private static List<ArticlesResponseView.ArticleSuggestionViewState> createArticleSuggestionViewStates(List<MessagingItem.ArticlesResponse.ArticleSuggestion> list, EventListener eventListener, EventFactory eventFactory) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<MessagingItem.ArticlesResponse.ArticleSuggestion> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(createArticleSuggestionViewState(it.next(), eventListener, eventFactory));
        }
        return arrayList;
    }

    private static MessagingCell<ArticlesResponseView.State, ArticlesResponseView> createArticlesResponseCell(MessagingItem.ArticlesResponse articlesResponse, MessagingCellProps messagingCellProps, EventListener eventListener, EventFactory eventFactory, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        return new MessagingCell<>(articlesResponse.getId(), new ArticlesResponseView.State(articlesResponse.getAgentDetails().getAgentName(), articlesResponse.getAgentDetails().isBot(), messagingCellProps, createArticleSuggestionViewStates(articlesResponse.getArticleSuggestions(), eventListener, eventFactory), avatarStateFactory.createAvatarState(articlesResponse.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_articles_response, ArticlesResponseView.class);
    }

    private static MessagingCell createCell(MessagingItem messagingItem, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory, EventListener eventListener, EventFactory eventFactory, boolean z2) {
        if (messagingItem instanceof MessagingItem.Query) {
            return createQueryCell(messagingItem, messagingCellProps, picasso, attachmentSettings, eventListener, eventFactory);
        }
        if (messagingItem instanceof MessagingItem.Response) {
            return createResponseCell((MessagingItem.Response) messagingItem, messagingCellProps, picasso, eventListener, eventFactory, avatarStateRenderer, avatarStateFactory);
        }
        if (messagingItem instanceof MessagingItem.OptionsResponse) {
            return createResponseOptionsCell((MessagingItem.OptionsResponse) messagingItem, messagingCellProps, eventListener, eventFactory, z2);
        }
        if (messagingItem instanceof MessagingItem.SystemMessage) {
            return createSystemMessageCell((MessagingItem.SystemMessage) messagingItem, messagingCellProps);
        }
        return null;
    }

    private static MessagingCell<EndUserCellFileState, EndUserFileCellView> createFileQueryCell(MessagingItem.FileQuery fileQuery, MessagingCellProps messagingCellProps, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        return new MessagingCell<>(fileQuery.getId(), new EndUserCellFileState(fileQuery.getId(), messagingCellProps, fileQuery.getStatus(), new MessageActionAdapter(eventListener, fileQuery, eventFactory), fileQuery.getAttachment(), fileQuery.getFailureReason(), attachmentSettings), R.layout.zui_cell_end_user_file_view, EndUserFileCellView.class);
    }

    private static MessagingCell<EndUserCellImageState, EndUserImageCellView> createImageQueryCell(MessagingItem.ImageQuery imageQuery, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        return new MessagingCell<>(imageQuery.getId(), new EndUserCellImageState(imageQuery.getId(), messagingCellProps, imageQuery.getStatus(), new MessageActionAdapter(eventListener, imageQuery, eventFactory), imageQuery.getAttachment(), imageQuery.getFailureReason(), attachmentSettings, picasso), R.layout.zui_cell_end_user_image_view, EndUserImageCellView.class);
    }

    private static MessagingCell<EndUserCellImageState, EndUserImageCellView> createImageQueryCellForFile(MessagingItem.ImageQuery imageQuery, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        return createImageQueryCell(imageQuery, messagingCellProps, picasso, attachmentSettings, eventListener, eventFactory);
    }

    private static MessagingCell createQueryCell(MessagingItem messagingItem, MessagingCellProps messagingCellProps, Picasso picasso, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        if (messagingItem instanceof MessagingItem.TextQuery) {
            return createTextQueryCell((MessagingItem.TextQuery) messagingItem, messagingCellProps, eventListener, eventFactory);
        }
        if (messagingItem instanceof MessagingItem.ImageQuery) {
            return createImageQueryCellForFile((MessagingItem.ImageQuery) messagingItem, messagingCellProps, picasso, attachmentSettings, eventListener, eventFactory);
        }
        if (messagingItem instanceof MessagingItem.FileQuery) {
            return createFileQueryCell((MessagingItem.FileQuery) messagingItem, messagingCellProps, attachmentSettings, eventListener, eventFactory);
        }
        return null;
    }

    private static MessagingCell createResponseCell(MessagingItem.Response response, MessagingCellProps messagingCellProps, Picasso picasso, EventListener eventListener, EventFactory eventFactory, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory) {
        if (response instanceof MessagingItem.ArticlesResponse) {
            return createArticlesResponseCell((MessagingItem.ArticlesResponse) response, messagingCellProps, eventListener, eventFactory, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.TransferResponse) {
            return createActionOptionsCell((MessagingItem.TransferResponse) response, messagingCellProps, eventListener, eventFactory, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.ActionResponse) {
            return createActionOptionsCell((MessagingItem.ActionResponse) response, messagingCellProps, eventListener, eventFactory, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.ImageResponse) {
            return createAgentImageCell((MessagingItem.ImageResponse) response, messagingCellProps, picasso, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.FileResponse) {
            return createAgentFileCell((MessagingItem.FileResponse) response, messagingCellProps, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof TypingItem) {
            return createTypingIndicatorCell((TypingItem) response, messagingCellProps, avatarStateRenderer, avatarStateFactory);
        }
        if (response instanceof MessagingItem.TextResponse) {
            return createTextResponseCell((MessagingItem.TextResponse) response, messagingCellProps, avatarStateRenderer, avatarStateFactory);
        }
        return null;
    }

    private static MessagingCell<ResponseOptionsViewState, ?> createResponseOptionsCell(final MessagingItem.OptionsResponse optionsResponse, MessagingCellProps messagingCellProps, final EventListener eventListener, final EventFactory eventFactory, boolean z2) {
        ResponseOptionsViewState responseOptionsViewState = new ResponseOptionsViewState(optionsResponse.getOptions(), new ResponseOptionHandler() { // from class: zendesk.classic.messaging.ui.MessagingCellFactory.4
            @Override // zendesk.classic.messaging.ui.ResponseOptionHandler
            public void onResponseOptionSelected(MessagingItem.Option option) {
                EventListener.this.onEvent(eventFactory.formOptionClick(optionsResponse, option));
            }
        }, messagingCellProps);
        if (z2) {
            return new MessagingCell<>(optionsResponse.getId(), responseOptionsViewState, R.layout.zui_cell_response_options_stacked, StackedResponseOptionsView.class);
        }
        return new MessagingCell<>(optionsResponse.getId(), responseOptionsViewState, R.layout.zui_cell_response_options, ResponseOptionsView.class);
    }

    private static MessagingCell<SystemMessageView.State, SystemMessageView> createSystemMessageCell(MessagingItem.SystemMessage systemMessage, MessagingCellProps messagingCellProps) {
        return new MessagingCell<>(systemMessage.getId(), new SystemMessageView.State(messagingCellProps, systemMessage.getSystemMessage()), R.layout.zui_cell_system_message, SystemMessageView.class);
    }

    private static MessagingCell<EndUserCellMessageState, EndUserMessageView> createTextQueryCell(MessagingItem.TextQuery textQuery, MessagingCellProps messagingCellProps, EventListener eventListener, EventFactory eventFactory) {
        return new MessagingCell<>(textQuery.getId(), new EndUserCellMessageState(textQuery.getId(), messagingCellProps, textQuery.getStatus(), new MessageActionAdapter(eventListener, textQuery, eventFactory), textQuery.getMessage()), R.layout.zui_cell_end_user_message, EndUserMessageView.class);
    }

    private static MessagingCell<AgentMessageView.State, AgentMessageView> createTextResponseCell(MessagingItem.TextResponse textResponse, MessagingCellProps messagingCellProps, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory) {
        return new MessagingCell<>(textResponse.getId(), new AgentMessageView.State(messagingCellProps, textResponse.getMessage(), textResponse.getAgentDetails().getAgentName(), textResponse.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(textResponse.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_agent_message_view, AgentMessageView.class);
    }

    private static MessagingCell<TypingIndicatorView.State, TypingIndicatorView> createTypingIndicatorCell(TypingItem typingItem, MessagingCellProps messagingCellProps, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory) {
        return new MessagingCell<>(TYPING_INDICATOR_ID, new TypingIndicatorView.State(messagingCellProps, typingItem.getAgentDetails().getAgentName(), typingItem.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(typingItem.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_typing_indicator, TypingIndicatorView.class);
    }

    public List<MessagingCell> createCells(List<MessagingItem> list, MessagingState.TypingState typingState, Picasso picasso, AttachmentSettings attachmentSettings) {
        AgentDetails agentDetails;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        List<MessagingItem> copyOf = CollectionUtils.copyOf(list);
        int i4 = 0;
        if (typingState != null && typingState.isTyping()) {
            if (typingState.getAgentDetails() != null) {
                agentDetails = typingState.getAgentDetails();
            } else {
                agentDetails = DEFAULT_TYPING_INDICATOR_LABEL_STATE;
            }
            copyOf.add(new TypingItem(this.dateProvider.now(), TYPING_INDICATOR_ID, agentDetails, i4));
        }
        List<MessagingCellProps> create = this.cellPropsFactory.create(copyOf);
        ArrayList arrayList = new ArrayList(copyOf.size());
        while (i4 < copyOf.size()) {
            MessagingCell createCell = createCell(copyOf.get(i4), create.get(i4), picasso, attachmentSettings, this.avatarStateRenderer, this.avatarStateFactory, this.eventListener, this.eventFactory, this.multilineResponseOptionsEnabled);
            if (createCell != null) {
                arrayList.add(createCell);
            }
            i4++;
        }
        return arrayList;
    }

    private static MessagingCell<ActionOptionsView.State, ActionOptionsView> createActionOptionsCell(MessagingItem.ActionResponse actionResponse, MessagingCellProps messagingCellProps, final EventListener eventListener, final EventFactory eventFactory, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        ArrayList arrayList = new ArrayList();
        for (final MessagingItem.Action action : actionResponse.getActions()) {
            arrayList.add(new ActionOptionsView.ActionOptionState(action.getDisplayName(), new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.MessagingCellFactory.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EventListener.this.onEvent(eventFactory.actionOptionClick(action));
                }
            }));
        }
        return new MessagingCell<>(actionResponse.getId(), new ActionOptionsView.State(actionResponse.getMessage(), actionResponse.getAgentDetails().getAgentName(), actionResponse.getAgentDetails().isBot(), messagingCellProps, arrayList, true, avatarStateFactory.createAvatarState(actionResponse.getAgentDetails()), avatarStateRenderer), R.layout.zui_cell_action_options, ActionOptionsView.class);
    }
}
