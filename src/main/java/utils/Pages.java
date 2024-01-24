package utils;

import pages.Autocomplete.AccentFolding;
import pages.Autocomplete.MultipleRemote_Page;
import pages.HomePage;
import pages.ProgressBar.DownloadDialogTab;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.datePicker.DisplayMultipleMonths;
import pages.datePicker.SelectDateRangeTab;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovements_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Droppable_Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePosition;
import pages.iframe.NestedIframe_Page;
import pages.iframe.Normal_Iframe_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.Synchronus_Resize_Page;
import pages.resizable.Textarea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Serialize_Page;

public class Pages {

    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private ConstrainMovements_Page constrainMovementsPage;

    private Handles_Page handlesPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private Droppable_Accept_Page droppableAcceptPage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Synchronus_Resize_Page synchronusResizePage;

    private Textarea_Page textareaPage = new Textarea_Page();

    private HomePage homePage;

    private NestedIframe_Page nestedIframePage;

    private Normal_Iframe_Page normalIframePage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;

    private MultipleRemote_Page multipleRemotePage;

    private Serialize_Page serializePage;

    private DownloadDialogTab downloadDialogTab;

    private AccentFolding accentFolding;

    private DisplayMultipleMonths displayMultipleMonths;

    private SelectDateRangeTab selectDateRangeTab;

    private RevertDraggablePosition revertDraggablePosition;


    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        normalIframePage = new Normal_Iframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovementsPage = new ConstrainMovements_Page();
        handlesPage = new Handles_Page();
        droppableAcceptPage = new Droppable_Accept_Page();
        multipleRemotePage = new MultipleRemote_Page();
        synchronusResizePage = new Synchronus_Resize_Page();
        textareaPage = new Textarea_Page();
        serializePage = new Serialize_Page();
        downloadDialogTab = new DownloadDialogTab();
        accentFolding = new AccentFolding();
        displayMultipleMonths = new DisplayMultipleMonths();
        selectDateRangeTab = new SelectDateRangeTab();
        revertDraggablePosition = new RevertDraggablePosition();

    }

    public HomePage getHomePage() {return homePage;}

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Droppable_Accept_Page getDroppableAcceptPage(){return droppableAcceptPage;}

    public Resizable_DefFunc_Page getResizableDefFuncPage(){
        return resizableDefFuncPage;
    }

    public Synchronus_Resize_Page getSynchronusResizePage() {return synchronusResizePage;}

    public Textarea_Page getTextareaPage(){return textareaPage;}

    public Selectable_DefFunc_Page getSelectableDefFuncPage(){
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage(){
        return nestedIframePage;
    }

    public Normal_Iframe_Page getNormalIframePage() {return normalIframePage;}

    public AlertTypes_Page getAlertTypesPage(){
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage(){
        return animatePage;
    }

    public ConstrainMovements_Page getConstrainMovementsPage(){return constrainMovementsPage;}

    public Handles_Page getHandlesPage(){return handlesPage;}

    public MultipleRemote_Page getMultipleRemotePage(){return multipleRemotePage;}

    public Serialize_Page getSerializePage(){return serializePage;}

    public DownloadDialogTab getDownloadDialogTab() {return downloadDialogTab;}

    public AccentFolding getAccentFolding(){return accentFolding;}

    public DisplayMultipleMonths getDisplayMultipleMonths(){return displayMultipleMonths;}

    public SelectDateRangeTab getSelectDateRangeTab(){return selectDateRangeTab;}

    public RevertDraggablePosition getRevertDraggablePosition() {return revertDraggablePosition;}















}
