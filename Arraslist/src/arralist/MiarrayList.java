package arralist;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class MiarrayList {

	protected Shell shlArraylistPowered;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text;
	
	private String elemento1;
	private String elemento2;
	private String elemento3;
	private String elemento4;
	private String elemento5;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MiarrayList window = new MiarrayList();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlArraylistPowered.open();
		shlArraylistPowered.layout();
		while (!shlArraylistPowered.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlArraylistPowered = new Shell();
		shlArraylistPowered.setSize(954, 392);
		shlArraylistPowered.setText("ArrayList 1.0 Powered by Ing Ricardo Roa");
		
		Label lblNewLabel = new Label(shlArraylistPowered, SWT.NONE);
		lblNewLabel.setBounds(294, 37, 117, 15);
		lblNewLabel.setText("Array De Datos A");
		
		List list = new List(shlArraylistPowered, SWT.BORDER);
		list.setBounds(248, 81, 222, 236);
		
		List list_1 = new List(shlArraylistPowered, SWT.BORDER);
		list_1.setBounds(514, 81, 255, 236);
		
		Label lblArrayDeDatos = new Label(shlArraylistPowered, SWT.NONE);
		lblArrayDeDatos.setBounds(593, 37, 122, 15);
		lblArrayDeDatos.setText("Array De Datos B");
		
		Button btnPasarDatos = new Button(shlArraylistPowered, SWT.NONE);
		btnPasarDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
		    try {
				 if(!list.getItems().equals(null)) {
					   
					 list_1.add(elemento1);
					 list_1.add(elemento2);
					 list_1.add(elemento3);
					 list_1.add(elemento4);
					 list_1.add(elemento5); 
					 
			     }
			} catch(IllegalArgumentException I) {
				
				JOptionPane.showMessageDialog(null,"inserte Datos en la lista A para ser copiados En la lista B, ya que no puede haber listas vacias");
			}
			}
		});
		btnPasarDatos.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnPasarDatos.setBounds(464, 32, 75, 25);
		btnPasarDatos.setText("Pasar Datos");
		
		text = new Text(shlArraylistPowered, SWT.BORDER);
		text.setBounds(81, 82, 117, 21);
		
		text_1 = new Text(shlArraylistPowered, SWT.BORDER);
		text_1.setBounds(81, 127, 117, 21);
		
		text_2 = new Text(shlArraylistPowered, SWT.BORDER);
		text_2.setBounds(81, 177, 117, 21);
		
		text_3 = new Text(shlArraylistPowered, SWT.BORDER);
		text_3.setBounds(81, 230, 117, 21);
		
		text_4 = new Text(shlArraylistPowered, SWT.BORDER);
		text_4.setBounds(81, 276, 117, 21);
		
		Label lblDato = new Label(shlArraylistPowered, SWT.NONE);
		lblDato.setBounds(10, 81, 55, 15);
		lblDato.setText("Dato 1");
		
		Label lblDato_1 = new Label(shlArraylistPowered, SWT.NONE);
		lblDato_1.setBounds(10, 127, 55, 15);
		lblDato_1.setText("Dato 2");
		
		Label lblNewLabel_1 = new Label(shlArraylistPowered, SWT.NONE);
		lblNewLabel_1.setBounds(10, 279, 55, 15);
		lblNewLabel_1.setText("Dato 5");
		
		Label lblDato_2 = new Label(shlArraylistPowered, SWT.NONE);
		lblDato_2.setBounds(10, 230, 55, 15);
		lblDato_2.setText("Dato 4");
		
		Label lblDato_3 = new Label(shlArraylistPowered, SWT.NONE);
		lblDato_3.setBounds(10, 177, 55, 15);
		lblDato_3.setText("Dato 3");
		
		Button btnGuardar = new Button(shlArraylistPowered, SWT.NONE);
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				elemento1=text_1.getText();
				elemento2=text_2.getText();
				elemento3=text_3.getText();
				elemento4=text_4.getText();
				elemento5=text.getText();
				
				list.add(elemento1);
				list.add(elemento2);
				list.add(elemento3);
				list.add(elemento4);
				list.add(elemento5);
			}
		});
		btnGuardar.setBounds(44, 318, 75, 25);
		btnGuardar.setText("Guardar");
		
		Button btnLimpiar = new Button(shlArraylistPowered, SWT.NONE);
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				text_1.setText(" ");
				text_2.setText(" ");
				text_3.setText(" ");
				text_4.setText(" ");
				text.setText(" ");
			}
		});
		btnLimpiar.setBounds(139, 318, 75, 25);
		btnLimpiar.setText("Limpiar");
		
		Button btnRetornaIndices = new Button(shlArraylistPowered, SWT.NONE);
		btnRetornaIndices.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				for(int i=0; i <list.getItemCount();i++) {
				}
				JOptionPane.showMessageDialog(null,"Datos Encontrados:"+list.getItemCount(),"Datos Lista A", 0);
			}
		});
		btnRetornaIndices.setBounds(81, 37, 117, 25);
		btnRetornaIndices.setText("Retorna Indices");

	}
}
