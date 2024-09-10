
class chessPiece {
	public array position;
	public String PieceType;
	public array movePattern;
	
	public countPossibleMoves(position, pieceType) {
		
		int moveAmount = 1;
		bool NearCorner = false;
		
		if pieceType == "Peón" {
				if position[1] == 8 {
					return moveAmount--;
				}
				else return moveAmount;
		}
		
		if pieceType == "Caballo" {
				moveAmount = 8;
				if position[0] == 1 || position[0] == 8 {
					nearCorner = true;
					moveAmount = moveAmount - 4;
					}
				
				if position[0] == 2 || position[0] == 7 {
					moveAmount = moveAmount - 2;
					}
				
				if position[1] == 1 || position[1] == 8 {
					if NearCorner {
						moveAmount = moveAmount - 2;
						}
						else {
							moveAmount = moveAmount - 4;
							}
				}
				if position[1] == 2 || position[7] {
					moveAmount = moveAmount - 2 }
				
				return moveAmount; 
				}
				
		if pieceType == "Rey" {
				moveAmount = 9;
				if position[0] = 1 || position[0] = 8 {
					nearCorner = true;
					moveAmount = moveAmount - 3;
					}
				if position[1] = 1 || position[1] = 8 {
					if nearCorner{
						moveAmount = moveAmount - 2
						}
					else {
						moveAmount = moveAmount - 3
						}
				}
				return moveAmount;
				}
	}
}



main() {
	String pieceType;
	array position;
	try {
	System.out.print("Ingrese el tipo de pieza de Ajedrez (eliga entre Peón, Caballo y Rey" + ": ");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	piecetype = reader.readLine();
	}
	catch (IOException e) {
	System.out.println("Error reading from the standard input");
	e.printStackTrace();
	}
	
	try {
		System.out.print("Ingrese la posición de la pieza en el formato '{X,Y}' " + ": ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		piecetype = reader.readLine();
		}
		catch (IOException e) {
		System.out.println("Error reading from the standard input");
		e.printStackTrace();
		}
	
	System.out.println("Esta pieza puede realizar " + chessPiece.CountPossibleMoves(position, pieceType) + " movimientos.")
}