
public class MatrixMultiplication {

	public MatrixMultiplication() {
		
	}
	
	public int[][] computeMatrixMultiplication(int[][] matrix1, int[][] matrix2, RowColumn firstRowColumn, RowColumn secondRowColumn) {
		if (matrix1.length == 1 && matrix1[0].length == 1 && matrix2.length == 1 && matrix2[0].length == 1) {
			int[][] matrix = new int[1][1];
			matrix[0][0] = matrix1[0][0] * matrix2[0][0];
			return matrix;
		} else {
			P1,
			p2,
			p3,
			p4,
			p5,
			p6,
			p7,
			return this.formMatrix(p1, p2, p3, p4, p5, p6, p7);
			
		}
	}
	
	public int[][] formMatrix(int[][] p1, int[][] p2, int[][] p3, int[][] p4, int[][] p5, int[][] p6, int[][] p7) {
		c11 = P5 + p4 - p2 + p6;
		c12 = p1 + p2;
		c21 = p3 + p4;
		c22 = p5 + p1 - p3 - p7;
		return (c11, c12, c21, c22);
	}

}
