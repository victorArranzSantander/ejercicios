import pytest
from factorial import factorial


@pytest.mark.parametrize(
    "input_a,expected",
    [
        (0, 1),
        (1, 1),
        (2, 2),
        (5, 120)
    ]
)

def test_factoriales(input_a, expected):
    assert factorial(input_a) == expected