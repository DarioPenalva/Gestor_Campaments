package CampamentPackage.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SimpleMenuEx extends JFrame {
    private JFrame ventanaPrincipal;
    public SimpleMenuEx() {

        initUI();
    }

    private void initUI() {

        createMenuBar();
        createBackGround();

        setIconImage(new ImageIcon("src/resources/icon.png").getImage());
        setTitle("IGMC - Increïble Gestor de Menjars de Campament");
        setSize(680, 330);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createBackGround() {
        var campIcon = new ImageIcon("src/resources/camp.png");
        JPanel mainPanel = new JPanel();
        var label = new JLabel(campIcon);
        mainPanel.add(label);
        add(mainPanel);
    }

    private void createMenuBar() {

        var menuBar = new JMenuBar();
        var listIcon = new ImageIcon("src/resources/menu.png");
        var exitIcon = new ImageIcon("src/resources/exit.png");
        var addIcon = new ImageIcon("src/resources/add.png");
        var openIcon = new ImageIcon("src/resources/open.png");
        var editIcon = new ImageIcon("src/resources/edit.png");
        var deleteIcon = new ImageIcon("src/resources/delete.png");

        // TaskBar
        var fileMenu = new JMenu("Menú");
        fileMenu.setMnemonic(KeyEvent.VK_M);

        var campMenu = new JMenu("Campaments");
        campMenu.setMnemonic(KeyEvent.VK_C);

        var localMenu = new JMenu("Localitzacions");
        localMenu.setMnemonic(KeyEvent.VK_L);

        var recipeMenu = new JMenu("Receptes");
        recipeMenu.setMnemonic(KeyEvent.VK_R);

        var alimMenu = new JMenu("Ingredients");
        alimMenu.setMnemonic(KeyEvent.VK_I);

        var deleteMenu = new JMenu("Esborrar");
        deleteMenu.setMnemonic(KeyEvent.VK_E);

        var helpMenu = new JMenu("Ajuda");
        helpMenu.setMnemonic(KeyEvent.VK_A);

        // Menú
        var eMenuItem = new JMenuItem("Exit", exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Tanca Aplicació");
        eMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(eMenuItem);

        // Campaments
        var checkCampItem = new JMenuItem("Obre..", openIcon);
        checkCampItem.setMnemonic(KeyEvent.VK_O);
        checkCampItem.setToolTipText("Obre Campament Existent");
        checkCampItem.addActionListener(e -> checkCampament());

        campMenu.add(checkCampItem);
        campMenu.addSeparator();

        var addCampItem = new JMenuItem("Nou..", addIcon);
        addCampItem.setMnemonic(KeyEvent.VK_N);
        addCampItem.setToolTipText("Afegeix Campament Nou");
        addCampItem.addActionListener(e -> addCampament());

        campMenu.add(addCampItem);

        var editCampItem = new JMenuItem("Edita..", editIcon);
        editCampItem.setMnemonic(KeyEvent.VK_E);
        editCampItem.setToolTipText("Modifica Campament");
        editCampItem.addActionListener(e -> editCampament());

        campMenu.add(editCampItem);

        // Localitzacions
        var checkLocItem = new JMenuItem("Llistat..", listIcon);
        checkLocItem.setMnemonic(KeyEvent.VK_L);
        checkLocItem.setToolTipText("Obre Llistat Llocs Existents");
        checkLocItem.addActionListener(e -> checkLocalitzacio());

        localMenu.add(checkLocItem);
        localMenu.addSeparator();

        var addlocalItem = new JMenuItem("Nova..", addIcon);
        addlocalItem.setMnemonic(KeyEvent.VK_N);
        addlocalItem.setToolTipText("Afegeix Lloc Nou");
        addlocalItem.addActionListener(e -> addLocalitzacio());

        localMenu.add(addlocalItem);

        var editLocalItem = new JMenuItem("Edita..", editIcon);
        editLocalItem.setMnemonic(KeyEvent.VK_E);
        editLocalItem.setToolTipText("Modifica Ingredient");
        editLocalItem.addActionListener(e -> editLocalitzacio());

        localMenu.add(editLocalItem);

        // Receptes
        var checkReceptaItem = new JMenuItem("Llistat..", listIcon);
        checkReceptaItem.setMnemonic(KeyEvent.VK_L);
        checkReceptaItem.setToolTipText("Obre Llistat Receptes Existents");
        checkReceptaItem.addActionListener(e -> checkReceptes());

        recipeMenu.add(checkReceptaItem);
        recipeMenu.addSeparator();

        var addReceptaItem = new JMenuItem("Nova..", addIcon);
        addReceptaItem.setMnemonic(KeyEvent.VK_N);
        addReceptaItem.setToolTipText("Afegeix Recepta Nova");
        addReceptaItem.addActionListener(e -> addRecepta());

        recipeMenu.add(addReceptaItem);

        var editReceptaItem = new JMenuItem("Edita..", editIcon);
        editReceptaItem.setMnemonic(KeyEvent.VK_E);
        editReceptaItem.setToolTipText("Modifica Ingredient");
        editReceptaItem.addActionListener(e -> editRecepta());

        recipeMenu.add(editReceptaItem);

        // Ingredients
        var checkIngredientItem = new JMenuItem("Llistat..", listIcon);
        checkIngredientItem.setMnemonic(KeyEvent.VK_L);
        checkIngredientItem.setToolTipText("Obre Llistat Ingredients Existents");
        checkIngredientItem.addActionListener(e -> checkIngredients());

        alimMenu.add(checkIngredientItem);
        alimMenu.addSeparator();

        var addIngredientItem = new JMenuItem("Nou..", addIcon);
        addIngredientItem.setMnemonic(KeyEvent.VK_N);
        addIngredientItem.setToolTipText("Afegeix Ingredient Nou");
        addIngredientItem.addActionListener(e -> addIngredient());

        alimMenu.add(addIngredientItem);

        var editIngredientItem = new JMenuItem("Edita..", editIcon);
        editIngredientItem.setMnemonic(KeyEvent.VK_E);
        editIngredientItem.setToolTipText("Modifica Ingredient");
        editIngredientItem.addActionListener(e -> editIngredient());

        alimMenu.add(editIngredientItem);

        // Esborra
        var deleteCampItem = new JMenuItem("Campament..", deleteIcon);
        deleteCampItem.setMnemonic(KeyEvent.VK_C);
        deleteCampItem.setToolTipText("Esborra Campament");
        deleteCampItem.addActionListener(e -> deleteCamp());

        deleteMenu.add(deleteCampItem);

        var deleteLocalItem = new JMenuItem("Localització..", deleteIcon);
        deleteLocalItem.setMnemonic(KeyEvent.VK_L);
        deleteLocalItem.setToolTipText("Esborra Localització");
        deleteLocalItem.addActionListener(e -> deleteLocal());

        deleteMenu.add(deleteLocalItem);

        var deleteRecipeItem = new JMenuItem("Recepta..", deleteIcon);
        deleteRecipeItem.setMnemonic(KeyEvent.VK_R);
        deleteRecipeItem.setToolTipText("Esborra Recepta");
        deleteRecipeItem.addActionListener(e -> deleteRecipe());

        deleteMenu.add(deleteRecipeItem);

        var deleteIngredientItem = new JMenuItem("Ingredient..", deleteIcon);
        deleteIngredientItem.setMnemonic(KeyEvent.VK_I);
        deleteIngredientItem.setToolTipText("Esborra Ingredient");
        deleteIngredientItem.addActionListener(e -> deleteIngredient());

        deleteMenu.add(deleteIngredientItem);


        // Ajuda
        var helpItem = new JMenuItem("Obtenir Suport", listIcon);
        helpItem.setMnemonic(KeyEvent.VK_O);
        helpItem.setToolTipText("La solució.");
        helpItem.addActionListener(e -> checkAjuda());

        helpMenu.add(helpItem);

        menuBar.add(fileMenu);
        menuBar.add(campMenu);
        menuBar.add(localMenu);
        menuBar.add(recipeMenu);
        menuBar.add(alimMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(deleteMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    private void deleteCamp() {
    }

    private void deleteLocal() {
    }

    private void deleteRecipe() {
    }

    private void deleteIngredient() {
    }

    private void editLocalitzacio() {
    }

    private void checkLocalitzacio() {
    }

    private void addLocalitzacio() {
    }

    private void checkReceptes() {
    }

    private void addRecepta() {
    }

    private void editRecepta() {
    }

    private void checkIngredients() {
    }

    private void addIngredient() {
    }

    private void editIngredient() {
    }

    private void checkCampament() {
    }

    private void addCampament() {
    }

    private void editCampament() {
    }


    private void checkAjuda() {
        JOptionPane.showMessageDialog(ventanaPrincipal, "¡Avisa en Darío, ell et pot ajudar!");
    }
}
