import javax.swing.*;

import java.awt.*;

public class Form extends JFrame{

    private JPanel panel;
    public boolean amIAuthenticated = false;
    JTextField nomeField = new JTextField();
    // Hospedagem (input) da variável é declarada globalmente (escopo global), pois funções em todo o código
    // utilizam do valor do nome

    public Form(){

        super("Formulário");
        initialize();
        // função que inicializa, para melhor organização do código

    }

    public void passwordCheck(){
        JFrame panel = new JFrame("Confirmação de senha");

        JPanel passPanel = new JPanel();
        passPanel.setLayout(null);
        passPanel.setBounds(620, 400, 600,800);

        JLabel yourPasswordHere = new JLabel("A sua senha vai aqui!");
        yourPasswordHere.setBounds(20, 15, 540, 48);
        yourPasswordHere.setFont(new Font("Arial", NORMAL, 20));

        JPasswordField passField = new JPasswordField("");
        passField.setBounds(20, 65, 540, 48);

        JButton sendButton = new JButton("Enviar");
        sendButton.setBounds(580, 65, 64, 48);
        sendButton.addActionListener(e -> {
            // O valor da senha deve corresponder para -->
            if((passField.getText()).equals("Bagheera")){
                String nome = JOptionPane.showInputDialog("Confirmar nome: ");
                // --> cadastrar o usuário, cujo nome vai corresponder com o do título da janela e do campo
                // (input) nome
                JOptionPane.showMessageDialog(null, "Usuário cadastrado.", "Login realizado", JOptionPane.INFORMATION_MESSAGE);
                this.setTitle("Formulário de " + nome);
                nomeField.setText(nome);
                amIAuthenticated = true;
                panel.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha incorreta ou usuário não existente...", "Oops!", JOptionPane.ERROR_MESSAGE);
                passField.setText("");
            }
        });

        // Row 1 //

        passPanel.add(yourPasswordHere);
        passPanel.add(passField);
        passPanel.add(sendButton);

        // Row 1 //

        panel.add(passPanel);
        panel.setContentPane(passPanel);
        panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel.setSize(700, 500);
        panel.setLocationRelativeTo(null);
        panel.setVisible(true);
    }
    
    public void initialize(){

        panel = new JPanel();
        panel.setLayout(null);
       
        // Instanciação e posicionamento (construção) dos componentes da janela, separados por rows (linhas)

        JLabel cadText = new JLabel("Cadastro de Pessoa");
        cadText.setBounds(20, 20, 800, 64);
        cadText.setFont(new Font("Arial", NORMAL, 64));
        cadText.setForeground(new Color(255, 172, 28));
       
        // ================================ Row 1 ================================ //

        JLabel personType = new JLabel("Tipo");
        personType.setBounds(20, 100, 200, 48);
        personType.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JComboBox<String> types;
        types = new JComboBox<>(new String[] {"Física", "Jurídica"});
        types.setBounds(240, 100, 200, 48);

        JLabel cpfLabel = new JLabel("CPF/CNPJ. . .");
        cpfLabel.setBounds(460, 100, 200, 48);
        cpfLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField cpfField = new JTextField();
        cpfField.setBounds(680, 100, 300, 48);
        cpfField.setBackground(new Color(229, 228, 226));
        cpfField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JLabel fornLabel = new JLabel("Fornecedor");
        fornLabel.setBounds(1000, 100, 200, 48);   
        fornLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        JCheckBox fornButton = new JCheckBox();
        fornButton.setBounds(1260, 100, 48, 48);
        fornButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        // ================================ Row 1 ================================ //

        // ================================ Row 2 ================================ //

        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 158, 200, 48);
        nomeLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        nomeField.setBounds(240, 158, 1080, 48);
        nomeField.setBackground(new Color(229, 228, 226));
        nomeField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        nomeField.addActionListener(e -> {
            this.setTitle("Formulário de " + nomeField.getText());
        });

        // ================================ Row 2 ================================ //

        // ================================ Row 3 ================================ //

        JLabel rgLabel = new JLabel("RG/Inscrição estadual");
        rgLabel.setBounds(20, 216, 200, 48);
        rgLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField rgField = new JTextField();
        rgField.setBounds(240, 216, 200, 48);
        rgField.setBackground(new Color(229, 228, 226));
        rgField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JLabel orgLabel = new JLabel("Orgão expedidor");
        orgLabel.setBounds(460, 216, 200, 48);
        orgLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField orgField = new JTextField();
        orgField.setBounds(680, 216, 200, 48);
        orgField.setBackground(new Color(229, 228, 226));
        orgField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        // ================================ Row 3 ================================ //

        // ================================ Row 4 ================================ //

        JLabel emaiLabel = new JLabel("Email");
        emaiLabel.setBounds(20, 274, 200, 48);
        emaiLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField emailField = new JTextField();
        emailField.setBounds(240, 274, 420, 48);
        emailField.setBackground(new Color(229, 228, 226));
        emailField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JLabel cepLabel = new JLabel("Cep");
        cepLabel.setBounds(680, 274, 200, 48);
        cepLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField cepField = new JTextField();
        cepField.setBounds(900, 274, 420, 48);
        cepField.setBackground(new Color(229, 228, 226));
        cepField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        // ================================ Row 4 ================================ //

        // ================================ Row 5 ================================ //

        JLabel paisLabel = new JLabel("País");
        paisLabel.setBounds(20, 332, 200, 48);
        paisLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField paisField = new JTextField("Brasil");
        paisField.setBounds(240, 332, 420, 48);
        paisField.setBackground(new Color(211, 211, 211));
        paisField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JLabel ufLabel = new JLabel("UF. . .");
        ufLabel.setBounds(680, 332, 200, 48);
        ufLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField ufField1 = new JTextField();
        ufField1.setBounds(900, 332, 80, 48);
        ufField1.setBackground(new Color(229, 228, 226));
        ufField1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField ufField2 = new JTextField();
        ufField2.setBounds(1000, 332, 320, 48);
        ufField2.setBackground(new Color(211, 211, 211));
        ufField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));


        // ================================ Row 5 ================================ //

        // ================================ Row 6 ================================ //

        JLabel munLabel = new JLabel("Município. . .");
        munLabel.setBounds(20, 390, 200, 48);
        munLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField munField = new JTextField();
        munField.setBounds(240, 390, 1080, 48);
        munField.setBackground(new Color(211, 211, 211));
        munField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        // ================================ Row 6 ================================ //

        // ================================ Row 7 ================================ //

        JLabel logLabel = new JLabel("Logradouro");
        logLabel.setBounds(20, 448, 200, 48);
        logLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField logField = new JTextField();
        logField.setBounds(240, 448, 1080, 48);
        logField.setBackground(new Color(229, 228, 226));
        logField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        // ================================ Row 7 ================================ //

        // ================================ Row 8 ================================ //

        JLabel numLabel = new JLabel("Número");
        numLabel.setBounds(20, 506, 200, 48);
        numLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField numField = new JTextField();
        numField.setBounds(240, 506, 200, 48);
        numField.setBackground(new Color(229, 228, 226));
        numField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JLabel compLabel = new JLabel("Complemento");
        compLabel.setBounds(460, 506, 200, 48);
        compLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField compField = new JTextField();
        compField.setBounds(680, 506, 640, 48);
        compField.setBackground(new Color(229, 228, 226));
        compField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        // ================================ Row 8 ================================ //

        // ================================ Row 9 ================================ //

        JLabel baiLabel = new JLabel("Bairro");
        baiLabel.setBounds(20, 564, 200, 48);
        baiLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField baiField = new JTextField();
        baiField.setBounds(240, 564, 200, 48);
        baiField.setBackground(new Color(229, 228, 226));
        baiField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JLabel telLabel = new JLabel("Telefone");
        telLabel.setBounds(460, 564, 200, 48);
        telLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        JTextField telField = new JTextField();
        telField.setBounds(680, 564, 200, 48);
        telField.setBackground(new Color(229, 228, 226));
        telField.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        JLabel sitLabel = new JLabel("Situação");
        sitLabel.setBounds(900, 564, 200, 48);
        sitLabel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        ButtonGroup sitGroup = new ButtonGroup();

        JRadioButton active = new JRadioButton("Ativo");
        active.setBounds(1120, 564, 60, 48);
        JRadioButton inactive = new JRadioButton("Inativo");
        inactive.setBounds(1190, 564, 60, 48);

        sitGroup.add(active);
        sitGroup.add(inactive);
        

        // ================================ Row 9 ================================ //
        
        // ================================ Row 10 ================================ //

        JButton confirmButton = new JButton("Confirmar");
        confirmButton.setBounds(20, 640, 180, 48);
        confirmButton.setBackground(new Color(255, 172, 28));
        confirmButton.addActionListener(e -> {
            int i = 0;
            for(Component f : panel.getComponents()){
                if(f instanceof JTextField){
                    // Itera todos os campos de texto, e soma 1 a cada campo preenchido
                    if(!(((JTextField)f).getText().isEmpty())){
                        i++;
                    }
                }
            }
            if(i == 15){
                passwordCheck();
                // Se todos os 15 campos estiverem preenchidos (não estiverem vazios)
                // invoca a tela de confirmação de senha
            }
        });

        JButton deleteButton = new JButton("Excluir");
        deleteButton.setBounds(210, 640, 180, 48);
        deleteButton.setBackground(new Color(255, 172, 28));
        deleteButton.addActionListener(e -> {
            // Se o usuário estiver autenticado (salvo o seu nome) e o seu nome estiver preenchido, pergunta se
            // ele realmente gostaria de excluir o cadastro
            if(amIAuthenticated && !(nomeField.getText().isEmpty())){
                int choice = JOptionPane.showOptionDialog(null, "Tem certeza que gostaria de apagar o cadastro de " + nomeField.getText() + " ?", "Apagar cadastro?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if(choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operação cancelada!", "Apagar cadastro?", JOptionPane.CLOSED_OPTION);
                }  
                else if(choice == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Operação concluída", "Cadastro apagado com sucesso", JOptionPane.PLAIN_MESSAGE);
                    this.setTitle("Formulário");
                    amIAuthenticated = false;
                }
            }
            // Caso esteja autenticado mas sem nome preenchido (como num recadastro ou algo assim), então apaga sem confirmar
            else if(amIAuthenticated && nomeField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Operação concluída", "Cadastro apagado com sucesso", JOptionPane.PLAIN_MESSAGE);
                this.setTitle("Formulário");
                amIAuthenticated = false;
            }
            // Caso não esteja autenticado, tal operação é indisponível
            else{
                JOptionPane.showMessageDialog(null, "Não foi possível excluir nenhum cadastro, pois ainda há um em andamento", null, JOptionPane.WARNING_MESSAGE);
            }
        });

        JButton clearButton = new JButton("Limpar");
        clearButton.setBounds(400, 640, 180, 48);
        clearButton.setBackground(new Color(211, 211, 211));
        clearButton.addActionListener(e -> {
            // Feito meio à moda antiga, com todos os inputs ao invés de instanceof, porque eu fiz primeiro
            // Basicamente, simplesmente substitui o texto de todos os inputs da janela Panel principal por um
            // espaço vazio
            JTextField[] fields = {
                cpfField, nomeField, rgField, orgField, emailField,
                cepField, paisField, ufField1, ufField2,
                munField, logField, numField, compField, baiField, telField
            };
            for (JTextField field : fields) {
                field.setText("");
            }
        });

        // ================================ Row 10 ================================ //

        // Title
        panel.add(cadText);


        panel.add(personType);
        panel.add(types);
        panel.add(cpfLabel);
        panel.add(cpfField);
        panel.add(fornLabel);
        panel.add(fornButton);

        panel.add(nomeLabel);
        panel.add(nomeField);

        panel.add(rgLabel);
        panel.add(rgField);
        panel.add(orgLabel);
        panel.add(orgField);

        panel.add(emaiLabel);
        panel.add(emailField);
        panel.add(cepLabel);
        panel.add(cepField);

        panel.add(paisLabel);
        panel.add(paisField);
        panel.add(ufLabel);
        panel.add(ufField1);
        panel.add(ufField2);

        panel.add(munLabel);
        panel.add(munField);

        panel.add(logLabel);
        panel.add(logField);

        panel.add(numLabel);
        panel.add(numField);
        panel.add(compLabel);
        panel.add(compField);

        panel.add(baiLabel);
        panel.add(baiField);
        panel.add(telLabel);
        panel.add(telField);
        panel.add(sitLabel);
        panel.add(active);
        panel.add(inactive);

        panel.add(confirmButton);
        panel.add(deleteButton);
        panel.add(clearButton);



        // Configuração do panel

        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1360, 680);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        
        new Form();

    }

}