package connectorClient;

import model.obix.ObixObject;

import javax.swing.*;

public class RepresentationRow {

    private JLabel uriLabel;
    private JCheckBox observedCheckBox;
    private JTextField valueTextField;
    private ObixObject obixObject;
    private JCheckBox writableCheckbox;
    private JButton getButton;
    private JCheckBox chooseCheckbox;
    private JCheckBox addedAsServiceCheckbox;
    private JCheckBox observedByColibriCheckBox;
    private JCheckBox observeColibriActionsCheckbox;
    private JComboBox param1TypeComboBox;
    private JComboBox param2TypeComboBox;


    public RepresentationRow(JLabel uriLabel, JCheckBox observedCheckBox, JTextField valueTextField,
                             ObixObject obixObject, JCheckBox writableCheckbox, JButton getButton,
                             JCheckBox addedAsServiceCheckBox, JCheckBox observedByColibriCheckBox, JCheckBox observeColibriActionsCheckbox) {
        this.uriLabel = uriLabel;
        this.observedCheckBox = observedCheckBox;
        this.valueTextField = valueTextField;
        this.obixObject = obixObject;
        this.writableCheckbox = writableCheckbox;
        this.getButton = getButton;
        this.addedAsServiceCheckbox = addedAsServiceCheckBox;
        this.observedByColibriCheckBox = observedByColibriCheckBox;
        this.observeColibriActionsCheckbox = observeColibriActionsCheckbox;
    }

    public RepresentationRow(ObixObject obixObject, JCheckBox chooseCheckbox) {
        this.obixObject = obixObject;
        this.chooseCheckbox = chooseCheckbox;
    }

    public RepresentationRow(ObixObject obixObject, JComboBox param1TypeComboBox, JComboBox param2TypeComboBox) {
        this.obixObject = obixObject;
        this.param1TypeComboBox = param1TypeComboBox;
        this.param2TypeComboBox = param2TypeComboBox;
    }

    public JLabel getUriLabel() {
        return uriLabel;
    }

    public void setUriLabel(JLabel uriLabel) {
        this.uriLabel = uriLabel;
    }

    public JCheckBox getObservedCheckBox() {
        return observedCheckBox;
    }

    public void setObservedCheckBox(JCheckBox observedCheckBox) {
        this.observedCheckBox = observedCheckBox;
    }

    public JTextField getValueTextField() {
        return valueTextField;
    }

    public void setValueTextField(JTextField valueTextField) {
        this.valueTextField = valueTextField;
    }

    public ObixObject getObixObject() {
        return obixObject;
    }

    public void setObixObject(ObixObject obixObject) {
        this.obixObject = obixObject;
    }

    public RepresentationRow get(JCheckBox checkBox) {
        return this;
    }

    public JCheckBox getWritableCheckbox() {
        return writableCheckbox;
    }

    public void setWritableCheckbox(JCheckBox writableCheckbox) {
        this.writableCheckbox = writableCheckbox;
    }

    public JButton getGetButton() {
        return getButton;
    }

    public void setGetButton(JButton getButton) {
        this.getButton = getButton;
    }

    public JCheckBox getChooseCheckbox() {
        return chooseCheckbox;
    }

    public void setChooseCheckbox(JCheckBox chooseCheckbox) {
        this.chooseCheckbox = chooseCheckbox;
    }

    public JCheckBox getAddedAsServiceCheckBox() {
        return addedAsServiceCheckbox;
    }

    public void setAddedAsServiceCheckBox(JCheckBox addedAsServiceCheckBox) {
        this.addedAsServiceCheckbox = addedAsServiceCheckBox;
    }

    public JCheckBox getObservedByColibriCheckBox() {
        return observedByColibriCheckBox;
    }

    public void setObservedByColibriCheckBox(JCheckBox observedByColibriCheckBox) {
        this.observedByColibriCheckBox = observedByColibriCheckBox;
    }

    public JCheckBox getObserveColibriActionsCheckbox() {
        return observeColibriActionsCheckbox;
    }

    public void setObserveColibriActionsCheckbox(JCheckBox observeColibriActionsCheckbox) {
        this.observeColibriActionsCheckbox = observeColibriActionsCheckbox;
    }

    public JComboBox getParam1TypeComboBox() {
        return param1TypeComboBox;
    }

    public void setParam1TypeComboBox(JComboBox param1TypeComboBox) {
        this.param1TypeComboBox = param1TypeComboBox;
    }

    public JComboBox getParam2TypeComboBox() {
        return param2TypeComboBox;
    }

    public void setParam2TypeComboBox(JComboBox param2TypeComboBox) {
        this.param2TypeComboBox = param2TypeComboBox;
    }
}
