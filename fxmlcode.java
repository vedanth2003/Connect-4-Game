<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>

<GridPane fx:id="rootGridPane" style="-fx-background-color: #DDF7F0;" xmlns="http://javafx.com/javafx/16" xmlns:fx="http://javafx.com/fxml/1" fx:controller="com.example.demo1.Controller">
    <columnConstraints>
        <ColumnConstraints  />
        <ColumnConstraints maxWidth="340.4" minWidth="179.4" prefWidth="196.0" />
    </columnConstraints>
    <rowConstraints>
        <RowConstraints minHeight="10.0" prefHeight="25.0" />
        <RowConstraints />
    </rowConstraints>
    <children>
        <Pane fx:id="myPane" GridPane.columnSpan="2" />
        <Pane fx:id="insertedDiscsPane" prefHeight="400.0" prefWidth="200.0" GridPane.rowIndex="1" />
        <VBox style="-fx-background-color: #2B3B4C;" GridPane.columnIndex="1" GridPane.rowIndex="1">
            <children>
                <Pane prefHeight="288.0" prefWidth="199.0">
                    <children>
                        <TextField fx:id="t1" layoutX="20.0" layoutY="36.0" promptText="Enter Player One Name" />
                        <Label fx:id="playerNameLabel" alignment="CENTER" layoutY="144.0" prefHeight="36.0" prefWidth="180.0" text="Player One" textFill="#faf6f6">
                            <font>
                                <Font name="System Bold" size="25.0" />
                            </font>
                        </Label>
                        <Label alignment="CENTER" layoutX="1.0" layoutY="187.0" prefHeight="36.0" prefWidth="180.0" text="Turn" textFill="#f4f3f3">
                            <font>
                                <Font size="25.0" />
                            </font>
                        </Label>
                        <TextField fx:id="t2" layoutX="20.0" layoutY="70.0" promptText="Enter Player Two Name" />
                        <Button fx:id="b1" layoutX="18.0" layoutY="106.0" mnemonicParsing="false" prefHeight="25.0" prefWidth="149.0" text="Set Names" />
                    </children></Pane>
                <Region prefHeight="69.0" prefWidth="346.0" />
            </children>
        </VBox>
    </children>
</GridPane>
