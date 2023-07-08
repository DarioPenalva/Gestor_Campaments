package CampamentPackage.Utils;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class SimpleMenuEx extends JFrame {
    private JFrame ventanaSecundaria;
    Icon listIcon = new ImageIcon("src/resources/menu.png");
    Icon exitIcon = new ImageIcon("src/resources/exit.png");
    Icon addIcon = new ImageIcon("src/resources/add.png");
    Icon openIcon = new ImageIcon("src/resources/open.png");
    Icon editIcon = new ImageIcon("src/resources/edit.png");
    Icon reloadIcon = new ImageIcon("src/resources/reload.png");
    Icon deleteIcon = new ImageIcon("src/resources/delete.png");
    public SimpleMenuEx() {

        createMenuBar();
        createBackGround();

        setIconImage(new ImageIcon("src/resources/icon.png").getImage());
        setTitle("IGC - Increïble Gestor de Campaments");
        setSize(900, 680);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createBackGround() {
        Icon campIcon = new ImageIcon("src/resources/camp.png");
        JPanel mainPanel = new JPanel();
        JLabel label = new JLabel(campIcon);
        mainPanel.add(label);
        add(mainPanel);
    }

    private void createMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        // TaskBar
        JMenu fileMenu = new JMenu("Menú");
        fileMenu.setMnemonic(KeyEvent.VK_M);

        JMenu campMenu = new JMenu("Campaments");
        campMenu.setMnemonic(KeyEvent.VK_C);

        JMenu localMenu = new JMenu("Localitzacions");
        localMenu.setMnemonic(KeyEvent.VK_L);

        JMenu personMenu = new JMenu("Assistents");
        personMenu.setMnemonic(KeyEvent.VK_S);

        JMenu recipeMenu = new JMenu("Receptes");
        recipeMenu.setMnemonic(KeyEvent.VK_R);

        JMenu alimMenu = new JMenu("Ingredients");
        alimMenu.setMnemonic(KeyEvent.VK_I);

        JMenu deleteMenu = new JMenu("Esborrar");
        deleteMenu.setMnemonic(KeyEvent.VK_E);

        JMenu helpMenu = new JMenu("Ajuda");
        helpMenu.setMnemonic(KeyEvent.VK_A);

        // Menú
        JMenuItem eMenuItem = new JMenuItem("Exit", exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Tanca Aplicació");
        eMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(eMenuItem);

        // Campaments
        JMenuItem checkCampItem = new JMenuItem("Obre..", openIcon);
        checkCampItem.setMnemonic(KeyEvent.VK_O);
        checkCampItem.setToolTipText("Obre Campament Existent");
        checkCampItem.addActionListener(e -> checkCampament());

        campMenu.add(checkCampItem);
        campMenu.addSeparator();

        JMenuItem addCampItem = new JMenuItem("Nou..", addIcon);
        addCampItem.setMnemonic(KeyEvent.VK_N);
        addCampItem.setToolTipText("Afegeix Campament Nou");
        addCampItem.addActionListener(e -> addCampament());

        campMenu.add(addCampItem);

        JMenuItem editCampItem = new JMenuItem("Edita..", editIcon);
        editCampItem.setMnemonic(KeyEvent.VK_E);
        editCampItem.setToolTipText("Modifica Campament");
        editCampItem.addActionListener(e -> editCampament());

        campMenu.add(editCampItem);

        // Localitzacions
        JMenuItem checkLocItem = new JMenuItem("Llistat..", listIcon);
        checkLocItem.setMnemonic(KeyEvent.VK_L);
        checkLocItem.setToolTipText("Obre Llistat Llocs Existents");
        checkLocItem.addActionListener(e -> checkLocalitzacio());

        localMenu.add(checkLocItem);
        localMenu.addSeparator();

        JMenuItem addlocalItem = new JMenuItem("Nova..", addIcon);
        addlocalItem.setMnemonic(KeyEvent.VK_N);
        addlocalItem.setToolTipText("Afegeix Lloc Nou");
        addlocalItem.addActionListener(e -> addLocalitzacio());

        localMenu.add(addlocalItem);

        JMenuItem editLocalItem = new JMenuItem("Edita..", editIcon);
        editLocalItem.setMnemonic(KeyEvent.VK_E);
        editLocalItem.setToolTipText("Modifica Ingredient");
        editLocalItem.addActionListener(e -> editLocalitzacio());

        localMenu.add(editLocalItem);

        // Assistents
        JMenuItem checkPersonItem = new JMenuItem("Llistat..", listIcon);
        checkPersonItem.setMnemonic(KeyEvent.VK_L);
        checkPersonItem.setToolTipText("Obre Llistat Persones Assistents");
        checkPersonItem.addActionListener(e -> checkPersones());

        personMenu.add(checkPersonItem);
        personMenu.addSeparator();

        JMenuItem addInstructorItem = new JMenuItem("Nou Monitor..", addIcon);
        addInstructorItem.setMnemonic(KeyEvent.VK_M);
        addInstructorItem.setToolTipText("Afegeix Monitor Nou");
        addInstructorItem.addActionListener(e -> addInstructor());

        personMenu.add(addInstructorItem);

        JMenuItem editInstructorItem = new JMenuItem("Edita Monitor..", editIcon);
        editInstructorItem.setMnemonic(KeyEvent.VK_O);
        editInstructorItem.setToolTipText("Modifica Monitor");
        editInstructorItem.addActionListener(e -> editInstructor());

        personMenu.add(editInstructorItem);

        JMenuItem addParticipantItem = new JMenuItem("Nou Participant..", addIcon);
        addParticipantItem.setMnemonic(KeyEvent.VK_P);
        addParticipantItem.setToolTipText("Afegeix Participant Nou");
        addParticipantItem.addActionListener(e -> addParticipant());

        personMenu.add(addParticipantItem);

        JMenuItem editParticipantItem = new JMenuItem("Edita Participant..", editIcon);
        editParticipantItem.setMnemonic(KeyEvent.VK_A);
        editParticipantItem.setToolTipText("Modifica Participant");
        editParticipantItem.addActionListener(e -> editParticipant());

        personMenu.add(editParticipantItem);

        // Receptes
        JMenuItem checkReceptaItem = new JMenuItem("Llistat..", listIcon);
        checkReceptaItem.setMnemonic(KeyEvent.VK_L);
        checkReceptaItem.setToolTipText("Obre Llistat Receptes Existents");
        checkReceptaItem.addActionListener(e -> checkReceptes());

        recipeMenu.add(checkReceptaItem);
        recipeMenu.addSeparator();

        JMenuItem addReceptaItem = new JMenuItem("Nova..", addIcon);
        addReceptaItem.setMnemonic(KeyEvent.VK_N);
        addReceptaItem.setToolTipText("Afegeix Recepta Nova");
        addReceptaItem.addActionListener(e -> addRecepta());

        recipeMenu.add(addReceptaItem);

        JMenuItem editReceptaItem = new JMenuItem("Edita..", editIcon);
        editReceptaItem.setMnemonic(KeyEvent.VK_E);
        editReceptaItem.setToolTipText("Modifica Ingredient");
        editReceptaItem.addActionListener(e -> editRecepta());

        recipeMenu.add(editReceptaItem);

        // Ingredients
        JMenuItem checkIngredientItem = new JMenuItem("Llistat..", listIcon);
        checkIngredientItem.setMnemonic(KeyEvent.VK_L);
        checkIngredientItem.setToolTipText("Obre Llistat Ingredients Existents");
        checkIngredientItem.addActionListener(e -> checkIngredients());

        alimMenu.add(checkIngredientItem);

        JMenuItem reloadIngredientItem = new JMenuItem("Actualitza..", reloadIcon);
        reloadIngredientItem.setMnemonic(KeyEvent.VK_A);
        reloadIngredientItem.setToolTipText("Actualitza Ingredients");
        reloadIngredientItem.addActionListener(e -> reloadIngredients());

        alimMenu.add(reloadIngredientItem);
        alimMenu.addSeparator();

        JMenuItem addIngredientItem = new JMenuItem("Nou..", addIcon);
        addIngredientItem.setMnemonic(KeyEvent.VK_N);
        addIngredientItem.setToolTipText("Afegeix Ingredient Nou");
        addIngredientItem.addActionListener(e -> addIngredient());

        alimMenu.add(addIngredientItem);

        JMenuItem editIngredientItem = new JMenuItem("Edita..", editIcon);
        editIngredientItem.setMnemonic(KeyEvent.VK_E);
        editIngredientItem.setToolTipText("Modifica Ingredient");
        editIngredientItem.addActionListener(e -> editIngredient());

        alimMenu.add(editIngredientItem);

        // Esborra
        JMenuItem deleteCampItem = new JMenuItem("Campament", deleteIcon);
        deleteCampItem.setMnemonic(KeyEvent.VK_C);
        deleteCampItem.setToolTipText("Esborra Campament");
        deleteCampItem.addActionListener(e -> deleteCamp());

        deleteMenu.add(deleteCampItem);

        JMenuItem deleteLocalItem = new JMenuItem("Localització", deleteIcon);
        deleteLocalItem.setMnemonic(KeyEvent.VK_L);
        deleteLocalItem.setToolTipText("Esborra Localització");
        deleteLocalItem.addActionListener(e -> deleteLocal());

        deleteMenu.add(deleteLocalItem);

        JMenuItem deleteRecipeItem = new JMenuItem("Recepta", deleteIcon);
        deleteRecipeItem.setMnemonic(KeyEvent.VK_R);
        deleteRecipeItem.setToolTipText("Esborra Recepta");
        deleteRecipeItem.addActionListener(e -> deleteRecipe());

        deleteMenu.add(deleteRecipeItem);

        JMenuItem deleteIngredientItem = new JMenuItem("Ingredient", deleteIcon);
        deleteIngredientItem.setMnemonic(KeyEvent.VK_I);
        deleteIngredientItem.setToolTipText("Esborra Ingredient");
        deleteIngredientItem.addActionListener(e -> deleteIngredient());

        deleteMenu.add(deleteIngredientItem);

        // Ajuda
        JMenuItem helpItem = new JMenuItem("Obtenir Suport", listIcon);
        helpItem.setMnemonic(KeyEvent.VK_O);
        helpItem.setToolTipText("La solució.");
        helpItem.addActionListener(e -> checkAjuda());

        helpMenu.add(helpItem);

        // Ordre MenuBar:
        menuBar.add(fileMenu);
        menuBar.add(campMenu);
        menuBar.add(localMenu);
        menuBar.add(personMenu);
        menuBar.add(recipeMenu);
        menuBar.add(alimMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(deleteMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    private void checkPersones() {
    }

    private void addInstructor() {
    }

    private void editInstructor() {
    }

    private void addParticipant() {
    }

    private void editParticipant() {
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

    private void reloadIngredients() {
    }

    private void addIngredient() {
        Object[] possibilities = {"Pernil", "Formatge", "Botifarró"};
        String s = (String)JOptionPane.showInputDialog(
                ventanaSecundaria,
                "Tria una ingredient:",
                "Afegeix Ingredient",
                JOptionPane.PLAIN_MESSAGE,
                addIcon,
                possibilities,
                "Pernil");

        //Si es tria una opció:
        if ((s != null) && (s.length() > 0)) {
            JOptionPane.showMessageDialog(ventanaSecundaria,
                    "Has triat " + s ,
                    "Ingredient Triat",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        //Si no es tria cap opció:
        JOptionPane.showMessageDialog(ventanaSecundaria,
                "Cal triar un ingredient!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
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
        JOptionPane.showMessageDialog(ventanaSecundaria,
                "¡Avisa en Darío, ell et pot ajudar!",
                "Ajuda",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
